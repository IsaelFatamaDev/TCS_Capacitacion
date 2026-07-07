package pe.edu.bbva.c1_problemas;

import java.util.Scanner;

public class ConversorSegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        long segundosTotales = sc.nextLong();

        long horas = segundosTotales / 3600;
        long minutos = (segundosTotales % 3600) / 60;
        long segundos = segundosTotales % 60;

        System.out.printf("%d horas, %d minutos, %d segundos%n", horas, minutos, segundos);

        sc.close();
    }
}
