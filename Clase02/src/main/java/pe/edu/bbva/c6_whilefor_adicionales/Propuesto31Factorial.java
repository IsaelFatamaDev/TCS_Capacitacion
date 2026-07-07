package pe.edu.bbva.c6_whilefor_adicionales;

import java.util.Scanner;

public class Propuesto31Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        Propuesto31Factorial ejercicio = new Propuesto31Factorial();

        System.out.println("Con for:");
        System.out.println("El factorial es: " + ejercicio.factorialWithFor(n));

        System.out.println("Con while:");
        System.out.println("El factorial es: " + ejercicio.factorialWithWhile(n));

        sc.close();
    }

    public long factorialWithFor(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public long factorialWithWhile(int n) {
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
