package pe.edu.bbva.c2_problemas_adicionales;

import java.util.Scanner;

public class PorcentajeCuatroNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        for (int i = 0; i < 4; i++) {
            double porcentaje = (numeros[i] * 100.0) / suma;
            System.out.printf("El numero %d (%d) representa el %.2f%% de la suma%n", i + 1, numeros[i], porcentaje);
        }

        sc.close();
    }
}
