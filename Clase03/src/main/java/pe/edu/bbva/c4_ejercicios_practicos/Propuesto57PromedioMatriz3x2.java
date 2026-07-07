package pe.edu.bbva.c4_ejercicios_practicos;

import java.util.Scanner;

public class Propuesto57PromedioMatriz3x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Numero [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }

        double promedio = suma / 6.0;
        System.out.println("El promedio aritmetico es: " + promedio);

        sc.close();
    }
}
