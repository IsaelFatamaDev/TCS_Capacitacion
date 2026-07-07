package pe.edu.bbva.c3_ejercicios_arreglos;

import java.util.Scanner;

public class Ejercicio2SumaColumnasMatriz4x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Numero [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < 3; j++) {
            int suma = 0;
            for (int i = 0; i < 4; i++) {
                suma = suma + matriz[i][j];
            }
            System.out.println("Suma columna " + j + ": " + suma);
        }

        sc.close();
    }
}
