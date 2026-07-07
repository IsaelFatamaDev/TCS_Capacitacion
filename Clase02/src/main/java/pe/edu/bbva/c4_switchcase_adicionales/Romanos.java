package pe.edu.bbva.c4_switchcase_adicionales;

import java.util.Scanner;

public class Romanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero menor a 4000: ");
        int numero = sc.nextInt();

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romano = new StringBuilder();
        int resto = numero;
        for (int i = 0; i < valores.length; i++) {
            while (resto >= valores[i]) {
                romano.append(simbolos[i]);
                resto -= valores[i];
            }
        }
        System.out.println("Numero romano: " + romano);

        sc.close();
    }
}
