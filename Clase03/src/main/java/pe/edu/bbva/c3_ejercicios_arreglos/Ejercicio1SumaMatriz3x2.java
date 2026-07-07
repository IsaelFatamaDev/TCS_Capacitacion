package pe.edu.bbva.c3_ejercicios_arreglos;

import java.util.Scanner;

public class Ejercicio1SumaMatriz3x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Numero [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma = suma + matriz[i][j];
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
