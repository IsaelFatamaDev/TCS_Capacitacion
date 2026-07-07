package pe.edu.bbva.c5_whilefor;

import java.util.Scanner;

public class MultiplosDeCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int n = sc.nextInt();

        System.out.println("Con for:");
        imprimirConFor(n);

        System.out.println("Con while:");
        imprimirConWhile(n);

        sc.close();
    }

    public static void imprimirConFor(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i * 5);
        }
    }

    public static void imprimirConWhile(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(i * 5);
            i++;
        }
    }
}
