package pe.edu.bbva.c2_ejercicios_casa;

import java.util.Scanner;

public class Propuesto53MultiplosVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        int contador = 0;
        for (int numero : numeros) {
            if (numero % n == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de multiplos de " + n + ": " + contador);

        sc.close();
    }
}
