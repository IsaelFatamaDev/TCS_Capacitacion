package pe.edu.bbva.c6_whilefor_adicionales;

import java.util.Scanner;

public class Propuesto33SumaProductoMultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        Propuesto33SumaProductoMultiplosDeTres ejercicio = new Propuesto33SumaProductoMultiplosDeTres();

        System.out.println("Con for:");
        long[] resultadoFor = ejercicio.sumAndProductWithFor(n);
        System.out.println("Suma: " + resultadoFor[0]);
        System.out.println("Producto: " + resultadoFor[1]);

        System.out.println("Con while:");
        long[] resultadoWhile = ejercicio.sumAndProductWithWhile(n);
        System.out.println("Suma: " + resultadoWhile[0]);
        System.out.println("Producto: " + resultadoWhile[1]);

        sc.close();
    }

    public long[] sumAndProductWithFor(int n) {
        long sum = 0;
        long product = 1;
        for (int i = 1; i <= n; i++) {
            int multiplo = i * 3;
            sum += multiplo;
            product *= multiplo;
        }
        return new long[]{sum, product};
    }

    public long[] sumAndProductWithWhile(int n) {
        long sum = 0;
        long product = 1;
        int i = 1;
        while (i <= n) {
            int multiplo = i * 3;
            sum += multiplo;
            product *= multiplo;
            i++;
        }
        return new long[]{sum, product};
    }
}
