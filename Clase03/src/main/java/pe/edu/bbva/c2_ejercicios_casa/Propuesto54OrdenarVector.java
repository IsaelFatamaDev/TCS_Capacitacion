package pe.edu.bbva.c2_ejercicios_casa;

import java.util.Scanner;

public class Propuesto54OrdenarVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingrese la forma de orden (A/D): ");
        String forma = sc.next();

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                boolean intercambiar = forma.equalsIgnoreCase("A")
                        ? numeros[j] > numeros[j + 1]
                        : numeros[j] < numeros[j + 1];
                if (intercambiar) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.print("Numeros ordenados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        sc.close();
    }
}
