package pe.edu.bbva.c3_switchcase;

import java.util.Scanner;

public class EjerciciosSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de mes: ");
        int mes = sc.nextInt();
        String estacion;

        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "Invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "Primavera";
                break;
            default:
                estacion = "Mes invalido";
        }
        System.out.println("Estacion: " + estacion);

        System.out.print("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el numero de mes: ");
        int mes2 = sc.nextInt();
        String estacion2;

        switch (mes2) {
            case 12:
                estacion2 = dia >= 21 ? "Verano" : "Primavera";
                break;
            case 1:
            case 2:
                estacion2 = "Verano";
                break;
            case 3:
                estacion2 = dia <= 20 ? "Verano" : "Otoño";
                break;
            case 4:
            case 5:
                estacion2 = "Otoño";
                break;
            case 6:
                estacion2 = dia <= 21 ? "Otoño" : "Invierno";
                break;
            case 7:
            case 8:
                estacion2 = "Invierno";
                break;
            case 9:
                estacion2 = dia <= 22 ? "Invierno" : "Primavera";
                break;
            case 10:
            case 11:
                estacion2 = "Primavera";
                break;
            default:
                estacion2 = "Mes invalido";
        }
        System.out.println("Estacion: " + estacion2);

        sc.close();
    }
}
