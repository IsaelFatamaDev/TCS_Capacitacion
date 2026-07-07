package pe.edu.bbva.c2_ejercicios_casa;

import java.util.Scanner;

public class Propuesto51SumaPromedioVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = suma / (double) numeros.length;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
