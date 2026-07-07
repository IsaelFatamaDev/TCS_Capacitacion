package pe.edu.bbva.c1_problemas;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El area del circulo es: %.2f%n", area);

        sc.close();
    }
}
