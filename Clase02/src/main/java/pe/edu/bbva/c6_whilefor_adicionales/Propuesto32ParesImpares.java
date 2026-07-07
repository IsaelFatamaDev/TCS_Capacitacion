package pe.edu.bbva.c6_whilefor_adicionales;

import java.util.Scanner;

public class Propuesto32ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero inicial: ");
        int start = sc.nextInt();
        System.out.print("Ingrese el numero final: ");
        int end = sc.nextInt();

        Propuesto32ParesImpares ejercicio = new Propuesto32ParesImpares();

        System.out.println("Con for:");
        int[] resultadoFor = ejercicio.countEvenOddWithFor(start, end);
        System.out.println("Pares: " + resultadoFor[0]);
        System.out.println("Impares: " + resultadoFor[1]);

        System.out.println("Con while:");
        int[] resultadoWhile = ejercicio.countEvenOddWithWhile(start, end);
        System.out.println("Pares: " + resultadoWhile[0]);
        System.out.println("Impares: " + resultadoWhile[1]);

        sc.close();
    }

    public int[] countEvenOddWithFor(int start, int end) {
        int even = 0;
        int odd = 0;
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                continue;
            }
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }

    public int[] countEvenOddWithWhile(int start, int end) {
        int even = 0;
        int odd = 0;
        int i = start;
        while (i <= end) {
            if (i % 5 != 0) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            i++;
        }
        return new int[]{even, odd};
    }
}
