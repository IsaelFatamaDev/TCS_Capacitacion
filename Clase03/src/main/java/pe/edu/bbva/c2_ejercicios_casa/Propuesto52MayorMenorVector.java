package pe.edu.bbva.c2_ejercicios_casa;

import java.util.Scanner;

public class Propuesto52MayorMenorVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);

        sc.close();
    }
}
