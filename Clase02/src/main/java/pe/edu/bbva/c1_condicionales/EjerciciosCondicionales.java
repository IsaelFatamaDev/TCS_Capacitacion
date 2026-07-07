package pe.edu.bbva.c1_condicionales;

import java.util.Scanner;

public class EjerciciosCondicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es neutro");
        }

        System.out.print("Ingrese un caracter: ");
        char caracter = sc.next().charAt(0);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una letra");
        }

        System.out.print("Ingrese un numero: ");
        int numero2 = sc.nextInt();
        if (numero2 % 3 == 0 && numero2 % 5 == 0) {
            System.out.println("Es multiplo de 3 y 5");
        } else {
            System.out.println("No es multiplo de 3 y 5");
        }

        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();

        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        System.out.println("El numero mayor es: " + mayor);

        sc.close();
    }
}
