package Logic;
import java.util.Scanner;

public class Lab_3 {
    Scanner sc = new Scanner(System.in);

public static void ejercicio_28(Scanner sc) {
        System.out.print("Ingrese día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese mes (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Ingrese año: ");
        int anio = sc.nextInt();

        String[] nombresMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                                 "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        if (mes >= 1 && mes <= 12) {
            System.out.println(dia + " de " + nombresMeses[mes-1] + " del " + anio);
        } else {
            System.out.println("Mes inválido");
        }
    }

    public static void ejercicio_29(Scanner sc) {
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();
        int producto = 0;
        for (int i = 0; i < b; i++) {
            producto += a;
        }
        System.out.println("El producto es: " + producto);
    }
    public static void ejercicio_30() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
    public static void ejercicio_31(Scanner sc) {
        System.out.print("Ingrese dividendo: ");
        int a = sc.nextInt();
        System.out.print("Ingrese divisor: ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("Error: división por cero");
            return;
        }
        int cociente = 0;
        int resto = a;
        while (resto >= b) {
            resto -= b;
            cociente++;
        }
        System.out.println("Cociente: " + cociente + " Resto: " + resto);
    }
    public static void ejercicio_32(Scanner sc) {
        System.out.print("Ingrese nota de quices: ");
        double q = sc.nextDouble();
        System.out.print("Ingrese nota de tareas: ");
        double t = sc.nextDouble();
        System.out.print("Ingrese nota de examen: ");
        double e = sc.nextDouble();

        double notaFinal = (q*0.25) + (t*0.35) + (e*0.40);
        System.out.println("La nota final es: " + notaFinal);
    }
    public static void ejercicio_33(Scanner sc) {
        int suma = 0, contador = 0;
        while (true) {
            System.out.print("Ingrese nota (-99 para terminar): ");
            int n = sc.nextInt();
            if (n == -99) break;
            suma += n;
            contador++;
        }
        if (contador > 0) {
            System.out.println("Media: " + (suma / (double)contador));
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
    public static void ejercicio_34(Scanner sc) {
        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese número: ");
            suma += sc.nextInt();
        }
        System.out.println("La suma es: " + suma);
    }
    public static void ejercicio_35(Scanner sc) {
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese tercer número: ");
        int c = sc.nextInt();

        int central;
        if ((a > b && a < c) || (a > c && a < b)) central = a;
        else if ((b > a && b < c) || (b > c && b < a)) central = b;
        else central = c;

        System.out.println("El número central es: " + central);
    }
    public static void ejercicio_36(Scanner sc) {
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();
        for (char c : palabra.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.println("Primera vocal: " + c);
                return;
            }
        }
        System.out.println("No tiene vocales.");
    }
    public static void ejercicio_37(Scanner sc) {
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();
        int contador = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                contador++;
            }
        }
        System.out.println("Cantidad de consonantes: " + contador);
    }
    public static void ejercicio_38(Scanner sc) {
        System.out.print("Ingrese numerador: ");
        int num = sc.nextInt();
        System.out.print("Ingrese denominador: ");
        int den = sc.nextInt();

        int mcd = mcd(num, den);
        System.out.println("Fracción simplificada: " + (num/mcd) + "/" + (den/mcd));
    }

    private static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void ejercicio_39(Scanner sc) {
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (bisiesto) System.out.println("Es bisiesto");
        else System.out.println("No es bisiesto");
    }
    public static void ejercicio_40(Scanner sc) {
        int dias = 0, errores = 0;
        int tempMaxGlobal = Integer.MIN_VALUE;
        int tempMinGlobal = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ingrese temp. máxima: ");
            int max = sc.nextInt();
            System.out.print("Ingrese temp. mínima: ");
            int min = sc.nextInt();

            if (max == -100 && min == -100) break;

            if (max == 9 || min == 9 || min > max) {
                errores++;
            } else {
                dias++;
                if (max > tempMaxGlobal) tempMaxGlobal = max;
                if (min < tempMinGlobal) tempMinGlobal = min;
            }
        }
        System.out.println("Días válidos: " + dias);
        System.out.println("Máxima registrada: " + tempMaxGlobal);
        System.out.println("Mínima registrada: " + tempMinGlobal);
        System.out.println("Errores: " + errores);
        double porcentaje = dias + errores > 0 ? (errores * 100.0 / (dias + errores)) : 0;
        System.out.println("Porcentaje de errores: " + porcentaje + "%");
    }
    public static void ejercicio_41(Scanner sc) {
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("Divisores de " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}