package pe.edu.bbva.c2_problemas_adicionales;

import java.util.Scanner;

public class CocienteResiduo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int b = sc.nextInt();

        int cociente = a / b;
        int residuo = a % b;

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);

        sc.close();
    }
}
