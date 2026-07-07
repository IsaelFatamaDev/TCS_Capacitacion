package pe.edu.bbva.c5_whilefor;

import java.util.Scanner;

public class CantidadEnRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero inicial: ");
        int start = sc.nextInt();
        System.out.print("Ingrese el numero final: ");
        int end = sc.nextInt();

        System.out.println("Con for:");
        int countFor = countWithFor(start, end);
        System.out.println("Cantidad de numeros: " + countFor);

        System.out.println("Con while:");
        int countWhile = countWithWhile(start, end);
        System.out.println("Cantidad de numeros: " + countWhile);

        sc.close();
    }

    public static int countWithFor(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
        }
        return count;
    }

    public static int countWithWhile(int start, int end) {
        int count = 0;
        int i = start;
        while (i <= end) {
            count++;
            i++;
        }
        return count;
    }
}
