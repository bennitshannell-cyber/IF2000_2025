from dataclasses import dataclass
from typing import List, Optional, Tuple


@dataclass
class Ficha:
    color: str  

    def __repr__(self):
        return self.color


class Tablero:
    def __init__(self):
        
        self.matriz: List[List[Optional[Ficha]]] = [[None for _ in range(8)] for _ in range(8)]
        self.inicializar_fichas()

    def inicializar_fichas(self):
    
        for fila in range(3):
            for col in range(8):
                if (fila + col) % 2 == 1:
                    self.matriz[fila][col] = Ficha('B')
        
        for fila in range(5, 8):
            for col in range(8):
                if (fila + col) % 2 == 1:
                    self.matriz[fila][col] = Ficha('R')

    def imprimir(self):
        
        print("    " + " ".join(str(c) for c in range(8)))
        print("   " + "--" * 8)
        for i, fila in enumerate(self.matriz):
            fila_str = []
            for celda in fila:
                if celda is None:
                    fila_str.append('.')
                else:
                    fila_str.append(celda.color)
            print(f"{i} | " + " ".join(fila_str))
        print()

    def dentro_tablero(self, fila: int, col: int) -> bool:
        return 0 <= fila < 8 and 0 <= col < 8

    def mover_ficha(self, origen: Tuple[int, int], destino: Tuple[int, int]) -> bool:
        f0, c0 = origen
        f1, c1 = destino
        
        if not (self.dentro_tablero(f0, c0) and self.dentro_tablero(f1, c1)):
            print("Movimiento fuera del tablero.")
            return False
        pieza = self.matriz[f0][c0]
        if pieza is None:
            print("No hay ficha en la posición de origen.")
            return False
        if self.matriz[f1][c1] is not None:
            print("La casilla destino está ocupada.")
            return False
        
        df = f1 - f0
        dc = c1 - c0
        if abs(df) != 1 or abs(dc) != 1:
            print("El movimiento debe ser diagonal y de una sola casilla.")
            return False
    
        if pieza.color == 'R' and df != 1:
            print("Las fichas rojas deben moverse hacia abajo (fila +1).")
            return False
        if pieza.color == 'B' and df != -1:
            print("Las fichas negras deben moverse hacia arriba (fila -1).")
            return False
    
        self.matriz[f1][c1] = pieza
        self.matriz[f0][c0] = None
        return True


class Juego:
    def __init__(self):
        self.tablero = Tablero()
        self.turno = 'R'

    def cambiar_turno(self):
        self.turno = 'B' if self.turno == 'R' else 'R'

    def pedir_movimiento(self) -> Optional[Tuple[Tuple[int, int], Tuple[int, int]]]:
        entrada = input(f"Turno {self.turno} - ingrese origen y destino (f0 c0 f1 c1) o 'salir': ")
        if entrada.strip().lower() == 'salir':
            return None
        partes = entrada.split()
        if len(partes) != 4:
            print("Entrada inválida. Debe ingresar 4 números separados por espacios.")
            return self.pedir_movimiento()
        try:
            f0, c0, f1, c1 = map(int, partes)
            return (f0, c0), (f1, c1)
        except ValueError:
            print("Entrada inválida. Asegúrese de ingresar números.")
            return self.pedir_movimiento()

    def validar_turno(self, origen: Tuple[int, int]) -> bool:
        f0, c0 = origen
        pieza = self.tablero.matriz[f0][c0]
        if pieza is None:
            print("No hay ficha en origen.")
            return False
        if pieza.color != self.turno:
            print(f"No puedes mover la ficha {pieza.color} en el turno de {self.turno}.")
            return False
        return True

    def loop(self):
        print("Bienvenido al juego de damas (versión simple).\n")
        while True:
            self.tablero.imprimir()
            movimiento = self.pedir_movimiento()
            if movimiento is None:
                print("Juego terminado por el usuario.")
                break
            origen, destino = movimiento
        
            if not (self.tablero.dentro_tablero(*origen) and self.tablero.dentro_tablero(*destino)):
                print("Coordenadas fuera del tablero. Intente de nuevo.")
                continue
            if not self.validar_turno(origen):
                continue
            mov_ok = self.tablero.mover_ficha(origen, destino)
            if mov_ok:
                self.cambiar_turno()


if __name__ == '__main__':
    juego = Juego()
    juego.loop()

