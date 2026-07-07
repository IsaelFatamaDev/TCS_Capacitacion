package pe.edu.bbva.c2_condicionales_adicionales;

import java.util.Scanner;

public class EjerciciosAdicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double monto = sc.nextDouble();
        System.out.print("Ingrese el tipo de cliente (G/A): ");
        String tipo = sc.next();
        System.out.print("Ingrese la forma de pago (C/P): ");
        String pago = sc.next();

        double porcentaje;
        if (tipo.equalsIgnoreCase("G") && pago.equalsIgnoreCase("C")) {
            porcentaje = 0.15;
        } else if (tipo.equalsIgnoreCase("G") && pago.equalsIgnoreCase("P")) {
            porcentaje = -0.10;
        } else if (tipo.equalsIgnoreCase("A") && pago.equalsIgnoreCase("C")) {
            porcentaje = 0.20;
        } else {
            porcentaje = -0.05;
        }

        double monedaAjuste = monto * porcentaje;
        double total = monto - monedaAjuste;

        if (porcentaje > 0) {
            System.out.println("Descuento: " + monedaAjuste);
        } else {
            System.out.println("Recargo: " + (-monedaAjuste));
        }
        System.out.println("Total a pagar: " + total);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        int resultado;
        if (numero > 0) {
            resultado = numero * 2;
        } else if (numero < 0) {
            resultado = numero * 3;
        } else {
            resultado = 0;
        }
        System.out.println("Resultado: " + resultado);

        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();

        int menor, medio, mayor;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                mayor = n3;
            } else {
                medio = n3;
                mayor = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                mayor = n3;
            } else {
                medio = n3;
                mayor = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                medio = n1;
                mayor = n2;
            } else {
                medio = n2;
                mayor = n1;
            }
        }

        System.out.println("Orden ascendente: " + menor + ", " + medio + ", " + mayor);
        System.out.println("Orden descendente: " + mayor + ", " + medio + ", " + menor);

        sc.close();
    }
}
