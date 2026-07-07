package pe.edu.bbva.c4_ejercicios_practicos;

import java.util.Scanner;

public class Propuesto60MayoresPorColumnaMatriz4x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Numero [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int mayor = matriz[0][j];
            for (int i = 1; i < 4; i++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
            System.out.println("Mayor de la columna " + j + ": " + mayor);
        }

        sc.close();
    }
}
