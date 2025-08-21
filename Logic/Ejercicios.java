package Logic;

public class Ejercicios {
    public boolean capicua(int n) {
        int original = n;
        int invertido = 0;
        int digito;
        while (n > 0) {
            digito = n % 10;
            invertido = (invertido * 10) + digito;
            n /= 10;
        }
        if (invertido == original) {
            return true;
        } else {
            return false;
        }
    }

    public void sumNum(int a) {
        int numOriginal = a;
        int numSumado = 0;
        int numInvertido = 0;
        int digito = 0;
        while (a > 0) {
            digito = a % 10;
            numSumado = (numInvertido * 10) + digito;
            a /= 10;
        }
        System.out.println("La suma de los digitos de a es: " + numOriginal + " es: " + numSumado);
    }
}
