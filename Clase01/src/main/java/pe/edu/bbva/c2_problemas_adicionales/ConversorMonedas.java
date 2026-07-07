package pe.edu.bbva.c2_problemas_adicionales;

import java.util.Scanner;

public class ConversorMonedas {

    private static final double TIPO_CAMBIO_DOLAR = 3.75;
    private static final double TIPO_CAMBIO_EURO = 4.05;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto en soles: ");
        double soles = sc.nextDouble();

        double dolares = soles / TIPO_CAMBIO_DOLAR;
        double euros = soles / TIPO_CAMBIO_EURO;

        System.out.printf("Dolares: %.2f%n", dolares);
        System.out.printf("Euros: %.2f%n", euros);

        sc.close();
    }
}
