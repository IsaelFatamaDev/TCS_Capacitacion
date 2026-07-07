package pe.edu.bbva.c4_ejercicios_practicos;

import java.util.Scanner;

public class Propuesto58MultiplicarMatrizPorK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Numero [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Ingrese el valor de K: ");
        int k = sc.nextInt();

        int suma = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = matriz[i][j] * k;
                suma += matriz[i][j];
            }
        }

        System.out.println("Matriz multiplicada por K:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
