package pe.edu.bbva.c6_whilefor_adicionales;

import java.util.Scanner;

public class Propuesto34ContarCeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();

        Propuesto34ContarCeros ejercicio = new Propuesto34ContarCeros();

        System.out.println("Con for:");
        System.out.println("Cantidad de ceros: " + ejercicio.countZerosWithFor(number));

        System.out.println("Con while:");
        System.out.println("Cantidad de ceros: " + ejercicio.countZerosWithWhile(number));

        sc.close();
    }

    public int countZerosWithFor(int number) {
        int numberAbs = Math.abs(number);
        if (numberAbs == 0) {
            return 1;
        }
        int count = 0;
        for (int resto = numberAbs; resto > 0; resto /= 10) {
            if (resto % 10 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countZerosWithWhile(int number) {
        int numberAbs = Math.abs(number);
        if (numberAbs == 0) {
            return 1;
        }
        int count = 0;
        int resto = numberAbs;
        while (resto > 0) {
            if (resto % 10 == 0) {
                count++;
            }
            resto /= 10;
        }
        return count;
    }
}
