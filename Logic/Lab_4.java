package Logic;
 import java.util.Scanner;

public class Lab_4 {

    public static void ejercicio_42() {
        System.out.println("Números perfectos menores a 1000:");
        for (int n = 1; n < 1000; n++) {
            int suma = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) suma += i;
            }
            if (suma == n) System.out.println(n);
        }
    }
    public static void ejercicio_43(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();

        int valor = Math.abs(num);
        int digitos = (valor == 0) ? 1 : 0;

        while (valor > 0) {
            valor /= 10;
            digitos++;
        }
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
    public static void ejercicio_44(Scanner sc) {
        System.out.print("Ingrese un número (1-3000): ");
        int num = sc.nextInt();

        if (num <= 0 || num > 3000) {
            System.out.println("Número fuera de rango");
            return;
        }

        String[] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] decenas = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] centenas = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] miles   = {"","M","MM","MMM"};

        String romano = miles[num/1000] +
                        centenas[(num%1000)/100] +
                        decenas[(num%100)/10] +
                        unidades[num%10];

        System.out.println("Número romano: " + romano);
    }
    public static void ejercicio_45(Scanner sc) {
        System.out.print("Ingrese x en radianes: ");
        double x = sc.nextDouble();

        double seno = 0;
        int signo = 1;

        for (int i = 1; i <= 17; i++) {
            int exp = 2 * i - 1;
            seno += signo * Math.pow(x, exp) / factorial(exp);
            signo *= -1;
        }

        System.out.println("Seno aproximado: " + seno);
        System.out.println("Seno real: " + Math.sin(x));
    }

    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    public static void ejercicio_46(Scanner sc) {
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        if (n == 1) System.out.println("A1 = 1");
        else if (n == 2) System.out.println("A2 = 2");
        else {
            int a1 = 1, a2 = 2, an = 0;
            for (int i = 3; i <= n; i++) {
                an = a1 + a2;
                a1 = a2;
                a2 = an;
            }
            System.out.println("A" + n + " = " + an);
        }
    }
    public static void ejercicio_47(Scanner sc) {
        int piso = 1;
        String opcion = "";

        while (!opcion.equals("salir")) {
            System.out.println("Piso actual: " + piso);
            System.out.print("Escriba 'subir', 'bajar' o 'salir': ");
            opcion = sc.next().toLowerCase();

            if (opcion.equals("subir")) {
                if (piso < 25) piso++;
                else System.out.println("Ya está en el último piso.");
            } else if (opcion.equals("bajar")) {
                if (piso > 1) piso--;
                else System.out.println("Ya está en el primer piso.");
            }
        }
    }
    public static void ejercicio_48(Scanner sc) {
        System.out.print("Ingrese día: ");
        int d = sc.nextInt();
        System.out.print("Ingrese mes: ");
        int m = sc.nextInt();
        System.out.print("Ingrese año: ");
        int a = sc.nextInt();

        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) diasMes[1] = 29;

        d++;
        if (d > diasMes[m-1]) {
            d = 1; m++;
            if (m > 12) {
                m = 1; a++;
            }
        }
        System.out.println("Día siguiente: " + d + "/" + m + "/" + a);
    }
    public static void ejercicio_49(Scanner sc) {
        System.out.print("Número de empleado: ");
        int num = sc.nextInt();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Sueldo por hora: ");
        double tarifa = sc.nextDouble();
        System.out.print("¿Pertenece al sindicato? (si/no): ");
        boolean sindicato = sc.next().equalsIgnoreCase("si");

        double bruto;
        if (horas <= 40) bruto = horas * tarifa;
        else bruto = 40 * tarifa + (horas - 40) * tarifa * 1.5;

        double deducciones = bruto * 0.09;
        if (sindicato) deducciones += bruto * 0.03;
        double neto = bruto - deducciones;

        System.out.println("Empleado: " + num + " " + nombre);
        System.out.println("Bruto: " + bruto);
        System.out.println("Deducciones: " + deducciones);
        System.out.println("Neto: " + neto);
    }
    public static void ejercicio_50(Scanner sc) {
        System.out.print("Ingrese horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Turno (D/N): ");
        char turno = sc.next().toUpperCase().charAt(0);
        System.out.print("¿Es domingo? (si/no): ");
        boolean domingo = sc.next().equalsIgnoreCase("si");

        int tarifa = (turno == 'D') ? 500 : 800;
        if (domingo) tarifa += (turno == 'D') ? 200 : 30;

        int jornal = horas * tarifa;
        System.out.println("Jornal diario: " + jornal);
    }
    public static void ejercicio_51(Scanner sc) {
        System.out.print("Ingrese hora: ");
        int h = sc.nextInt();
        System.out.print("Ingrese minutos: ");
        int m = sc.nextInt();
        System.out.print("Ingrese segundos: ");
        int s = sc.nextInt();

        s++;
        if (s == 60) { s = 0; m++; }
        if (m == 60) { m = 0; h++; }
        if (h == 24) { h = 0; }

        System.out.println("Hora +1 segundo: " + h + ":" + m + ":" + s);
    }
    public static void ejercicio_52(Scanner sc) {
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma1 = 0;
        for (int x = 0; x <= n; x++) suma1 += 2 * x + 1;
        System.out.println("Primera sumatoria = " + suma1);

        System.out.print("Ingrese M: ");
        int M = sc.nextInt();
        int suma2 = 0;
        for (int y = 0; y <= M; y++) {
            for (int x = 1; x <= n; x++) suma2 += 2 * x + y * y;
        }
        System.out.println("Segunda sumatoria = " + suma2);
    }
}
