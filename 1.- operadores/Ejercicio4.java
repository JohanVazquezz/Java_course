//EJERCICIO 4: UNA COMPAÑIA DE VENTA DE CARROS USADOS, PAGA A SU PERSONAL DE VENTAS UN SALARIO DE $1000 MENSUALES, MAS UNA COMISION DE $150 POR CADA CARRO VENDIDO, MAS EL 5% DEL VALOR DE LA VENTA POR CARRO. CADA MES EL CAPTURISA DE LA EMPRESA INGRESA EN LA COMPUTADORA LOS DATOS PERTINENTES. HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO MENSUAL DE UN VENDEDOR DADO.
//Johan Vazquez

package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String[] args) {
        Scanner jin = new Scanner (System.in);

        float salario, comision1=0, costocarro, comision2=0;
        int carros, contadorc=1;

        System.out.print("¿cuantos carros vendiste en el mes? \n->");
        carros = jin.nextInt();

        while (carros !=0) {
            System.out.print("¿cuanto te costo el " + contadorc + " carro? \n->");
            costocarro = jin.nextFloat();
            comision1 = comision1 + ((costocarro / 100) *5);
            comision2+= 150;
            contadorc++;
            carros--;
        }

        salario = comision1 + comision2 + 1000;
        System.out.println("\nSALARIO MENSUAL: " + salario);
    }
}