package pe.edu.bbva.c1_problemas;

import java.util.Scanner;

public class SumaPrimerosN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        long suma = (long) n * (n + 1) / 2;

        System.out.println("La suma de los primeros " + n + " numeros enteros positivos es: " + suma);

        sc.close();
    }
}
