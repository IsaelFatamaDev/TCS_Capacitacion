package pe.edu.bbva.c1_ejercicios;

import java.util.Scanner;

public class Ejercicio3ContarPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int contador = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                contador++;
            }
        }

        System.out.println("Cantidad de numeros primos: " + contador);

        sc.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }

        }
        return true;
    }
}
