package pe.edu.bbva.c1_ejercicios;

import java.util.Scanner;

public class Ejercicio4BusquedaArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[7];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("número a buscar: ");
        int buscado = sc.nextInt();

        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            System.out.println("El numero no existe");
        } else {
            System.out.println("El numero existe en la posicion: " + (posicion + 1));
        }

        sc.close();
    }
}
