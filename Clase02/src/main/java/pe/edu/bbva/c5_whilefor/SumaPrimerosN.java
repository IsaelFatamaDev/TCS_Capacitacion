package pe.edu.bbva.c5_whilefor;

import java.util.Scanner;

public class SumaPrimerosN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        SumaPrimerosN suma = new SumaPrimerosN();

        System.out.println("Con for:");
        System.out.println("La suma es: " + suma.sumWithFor(n));

        System.out.println("Con while:");
        System.out.println("La suma es: " + suma.sumWithWhile(n));

        sc.close();
    }

    public int sumWithFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumWithWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
}
