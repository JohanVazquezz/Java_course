//EJERCICIO 12: HACER UN PROGRAMA QUE PASE DE KG A OTRA UNIDAD DE MEDIDAD DE MASA, MOSTRAR EN PANTALL UN MENU CON LAS OPCIONES POSIBLES
//Johan Vazquez

package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        float peso;
        
        System.out.print("Digita tu peso en KG y en seguida en cual de las siguientes opciones deseas convertir tu peso:\n1.gramos\n2.libras\n3.salir\n\t->");
        peso = jin.nextFloat();
        int decision = jin.nextInt();
        
        switch(decision){
            case 1:{
                peso*= 1000;
                System.out.println("\nTU PESO EN GRAMOS: " + peso);
                break;
            }
            case 2:{
                peso*= 2.204;
                System.out.println("\nTU PESO EN LIBRAS: " + peso);
                break;
            }
            case 3:{
                System.out.println("\nSALIDA EXITOSA:");
                break;
            }
            default:{
                System.out.println("\nOPCION INVALIDA");
            }
        }
    }
}