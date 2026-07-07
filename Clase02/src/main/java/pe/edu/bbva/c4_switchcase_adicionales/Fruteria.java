package pe.edu.bbva.c4_switchcase_adicionales;

import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los kilos de manzanas: ");
        double kilos = sc.nextDouble();
        System.out.print("Ingrese el precio por kilo: ");
        double precioKilo = sc.nextDouble();

        double descuento;
        if (kilos <= 2) {
            descuento = 0;
        } else if (kilos <= 5) {
            descuento = 0.10;
        } else if (kilos <= 10) {
            descuento = 0.20;
        } else {
            descuento = 0.30;
        }

        double subtotal = kilos * precioKilo;
        double total = subtotal - (subtotal * descuento);
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}
