package pe.edu.bbva.c1_problemas;

import java.util.Scanner;

public class CalculoIGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de venta del producto: ");
        double valorVenta = sc.nextDouble();

        double igv = valorVenta * 0.19;
        double precioVenta = valorVenta + igv;

        System.out.printf("IGV (19%%): %.2f%n", igv);
        System.out.printf("Precio de venta: %.2f%n", precioVenta);

        sc.close();
    }
}
