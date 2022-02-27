//EJERCICIO 7: CONSTRUIR UN PROGRAMA QUE, DADO UN NUMERO TOTAL DE HORAS, DEVUELVE EL NUMERO DE SEMANA, DIAS Y HORAS EQUIVALENTES. POR EJEMPLO, DADO UN TOTAL DE 1000 HORAS DEBE MOSTRAR 5 SEMANAS, 6 DIAS Y 16 HORAS
//Johan Vazquez

package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main (String[] args) {
        Scanner jin = new Scanner (System.in);

        int horas, semanas, dias, horas_restantes;

        System.out.print("\n\ndigita el numero de horas que quieres descomponer en semanas,dias y horas\n->");
        horas = jin.nextInt();

        semanas = horas / 168;
        dias = horas%168 / 24;
        horas_restantes = horas % 24;

        System.out.println("\n\nsemanas: " + semanas + "\ndias: " + dias + "\nhoras: " + horas_restantes);
    }
}