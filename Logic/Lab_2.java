package Logic;

import java.util.Scanner;

public class Lab_2 {

    static Scanner sc = new Scanner(System.in);

    public static void ejercicio_13() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los pares de 2 a 1000 es: " + suma);
    }
    public static void ejercicio_14() {
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
    public static void ejercicio_15() {
        System.out.print("Ingrese la base (X): ");
        int x = sc.nextInt();
        System.out.print("Ingrese el exponente (N): ");
        int n = sc.nextInt();

        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }
        System.out.println(x + " elevado a la " + n + " es: " + resultado);
    }
    public static void ejercicio_16() {
        System.out.print("Ingrese un número (1-12): ");
        int mes = sc.nextInt();

        String nombreMes;
        switch (mes) {
            case 1: nombreMes = "Enero"; break;
            case 2: nombreMes = "Febrero"; break;
            case 3: nombreMes = "Marzo"; break;
            case 4: nombreMes = "Abril"; break;
            case 5: nombreMes = "Mayo"; break;
            case 6: nombreMes = "Junio"; break;
            case 7: nombreMes = "Julio"; break;
            case 8: nombreMes = "Agosto"; break;
            case 9: nombreMes = "Septiembre"; break;
            case 10: nombreMes = "Octubre"; break;
            case 11: nombreMes = "Noviembre"; break;
            case 12: nombreMes = "Diciembre"; break;
            default: nombreMes = "Número inválido";
        }
        System.out.println("El mes es: " + nombreMes);
    }
    public static void ejercicio_17() {
        System.out.print("Ingrese un número X: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("F(x) = " + (x + 5));
        } else if (x < 0) {
            System.out.println("F(x) = " + (x * x));
        } else {
            System.out.println("F(x) = 1");
        }
    }
    public static void ejercicio_18() {
        System.out.print("Ingrese lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese lado c: ");
        double c = sc.nextDouble();

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("El área del triángulo es: " + area);
    }
    public static void ejercicio_19() {
        System.out.print("Ingrese valor de A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese valor de B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Ahora A = " + a + " y B = " + b);
    }
    public static void ejercicio_20() {
        System.out.print("Ingrese X0: ");
        double x0 = sc.nextDouble();
        System.out.print("Ingrese Y0: ");
        double y0 = sc.nextDouble();
        System.out.print("Ingrese X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese Y1: ");
        double y1 = sc.nextDouble();

        if (x0 == x1) {
            System.out.println("Error: la recta es vertical, pendiente indefinida.");
            return;
        }

        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - m * x0;

        System.out.println("La ecuación de la recta es: y = " + m + "x + " + b);
    }
    public static void ejercicio_21() {
        System.out.print("Ingrese un número K: ");
        int k = sc.nextInt();

        int suma = 0;
        for (int i = 1; i < k; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }
    public static void ejercicio_22() {
        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = sc.nextInt();
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("El promedio es: " + (suma / n));
    }
    public static void ejercicio_23() {
        int pares = 0, impares = 0, sumaPares = 0, sumaImpares = 0, sumaTotal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese número " + i + ": ");
            int num = sc.nextInt();
            sumaTotal += num;
            if (num % 2 == 0) {
                pares++;
                sumaPares += num;
            } else {
                impares++;
                sumaImpares += num;
            }
        }

        System.out.println("Cantidad pares: " + pares);
        System.out.println("Cantidad impares: " + impares);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }
    public static void ejercicio_24() {
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumaPares += i;
            else sumaImpares += i;
        }
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
    public static void ejercicio_25() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("La suma de cuadrados es: " + suma);
    }
    public static void ejercicio_26() {
        System.out.print("Ingrese un número N: ");
        int n = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
    public static void ejercicio_27() {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese número " + i + ": ");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El valor máximo es: " + max);
    }
}
