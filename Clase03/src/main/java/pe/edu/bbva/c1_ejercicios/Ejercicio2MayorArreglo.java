package pe.edu.bbva.c1_ejercicios;

import java.util.Scanner;

public class Ejercicio2MayorArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        // for (tipo_variable : coleccion_o_arreglo)
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}
