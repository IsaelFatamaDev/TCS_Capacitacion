package pe.edu.bbva.c1_ejercicios;

import java.util.Scanner;

public class Ejercicio1SumaArreglo {
    public static void main(String[] args) {
        Ejercicio1SumaArreglo ejercicio = new Ejercicio1SumaArreglo();
        ejercicio.sumArray();
    }

    public void sumArray() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma es: " + suma);
    }
}
