package Logic;

import java.util.Scanner;

public class Lab_1 {

    Scanner sc = new Scanner(System.in);

    public void ejercicio_1() {
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    public void ejercicio_2() {
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        System.out.println("Valor absoluto = " + n);
    }
    public void ejercicio_3() {
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nSuma = " + suma);
    }
    public void ejercicio_4() {
        System.out.print("Ingrese 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // ordenar con comparaciones simples
        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }

        System.out.println("Orden ascendente: " + a + " " + b + " " + c);
    }
    public void ejercicio_5() {
        System.out.print("Ingrese 2 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado;

        if (a == b) {
            resultado = a * b;
        } else if (a > b) {
            resultado = a - b;
        } else {
            resultado = a + b;
        }
        System.out.println("Resultado = " + resultado);
    }
    public void ejercicio_6() {
        boolean hubo10 = false;
        int nota;
        do {
            System.out.print("Ingrese una nota (-1 para terminar): ");
            nota = sc.nextInt();
            if (nota == 10) {
                hubo10 = true;
            }
        } while (nota != -1);
        if (hubo10) {
            System.out.println("Sí hubo nota 10");
        } else {
            System.out.println("No hubo nota 10");
        }
    }
    public void ejercicio_7() {
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese sexo (F/M): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        int pulsaciones;
        if (sexo == 'F') {
            pulsaciones = (220 - edad) / 10;
        } else {
            pulsaciones = (210 - edad) / 10;
        }
        System.out.println("Número de pulsaciones cada 10s: " + pulsaciones);
    }
    public void ejercicio_8() {
        System.out.print("Ingrese salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese años en la empresa: ");
        int años = sc.nextInt();

        double utilidad;
        if (años < 1) utilidad = salario * 0.05;
        else if (años < 2) utilidad = salario * 0.07;
        else if (años < 5) utilidad = salario * 0.10;
        else if (años < 10) utilidad = salario * 0.15;
        else utilidad = salario * 0.20;

        System.out.println("Utilidad = " + utilidad);
    }
    public void ejercicio_9() {
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        boolean primo = true;

        if (n <= 1) primo = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) System.out.println("Es primo");
        else System.out.println("No es primo");
    }
    public void ejercicio_10() {
        System.out.print("Ingrese cantidad de computadoras: ");
        int cant = sc.nextInt();
        double precioUnit = 11000;
        double total = cant * precioUnit;
        double descuento;

        if (cant < 5) descuento = total * 0.10;
        else if (cant < 10) descuento = total * 0.20;
        else descuento = total * 0.40;

        double totalPagar = total - descuento;

        System.out.println("Cantidad: " + cant);
        System.out.println("Precio sin descuento: " + total);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
    public void ejercicio_11() {
        System.out.print("Ingrese un número N: ");
        int n = sc.nextInt();

        System.out.println("Primos hasta " + n + ":");
        for (int num = 2; num <= n; num++) {
            boolean primo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) System.out.print(num + " ");
        }
        System.out.println();
    }
    public void ejercicio_12() {
        System.out.print("Ingrese base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("Área del triángulo = " + area);
    }
}
