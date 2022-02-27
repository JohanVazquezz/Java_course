//EJERCICIO 4: EN MEGAPLAZA SE HACE UN 20& DE DESCUENTO A LOS CLIENTES CUYA COMPRA SUPERE LOS $300 ¿CUAL SERA LA CANTIDAD QUE PAGARA UNA PERSONA POR SU COMPRA?
//Johan Vazquez

package ejercicio4;
import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);

        System.out.print("\ndigite el total de su compra:\n->");
        double total = jin.nextDouble();

        if(total > 300){
            total = (total) - (total * .20);
            System.out.println("\nRE: el total a pagar con el descuento del %20 es de: " + total);
        }else{
            System.out.println("\nRE: no alcanza descuento");
        }
    }
}