package Logic;

public class Ejercicios_Semana2_PracticaEnClase {

    public void quiz2_A_primos() {
        // Código del ejercicio A
    }

    public void quiz2_B_piramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Controla los espacios vacios
            for (int j = 1; j <= n - i; j++) {
                //Controla los *s de la piramide
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

