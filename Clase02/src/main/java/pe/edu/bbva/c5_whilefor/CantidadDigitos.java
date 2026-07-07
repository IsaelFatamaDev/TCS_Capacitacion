package pe.edu.bbva.c5_whilefor;

import java.util.Scanner;

public class CantidadDigitos {
    private static final String MENSAJE_CANTIDAD = "Cantidad de digitos: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        int numberAbs = Math.abs(number);

        System.out.println("Con for:");
        int digitsFor = countDigitsWithFor(numberAbs);
        System.out.println(MENSAJE_CANTIDAD + digitsFor);

        System.out.println("Con while:");
        int digitsWhile = countDigitsWithWhile(numberAbs);
        System.out.println(MENSAJE_CANTIDAD + digitsWhile);

        System.out.println("Con String:");
        int digitsString = countDigitsWithString(numberAbs);
        System.out.println(MENSAJE_CANTIDAD + digitsString);

        sc.close();
    }

    public static int countDigitsWithFor(int number) {
        int digits = number == 0 ? 1 : 0;
        for (int remainder = number; remainder > 0; remainder /= 10) {
            digits++;
        }
        return digits;
    }

    public static int countDigitsWithWhile(int number) {
        int digits = 0;
        int remainder = number;
        if (remainder == 0) {
            digits = 1;
        } else {
            while (remainder > 0) {
                remainder /= 10;
                digits++;
            }
        }
        return digits;
    }

    public static int countDigitsWithString(int number) {
        return String.valueOf(number).length();
    }
}
