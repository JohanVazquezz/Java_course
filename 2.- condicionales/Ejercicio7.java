//EJERCICIO 7: PEDIR TRES NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR O MENOR A MAYOR
//Johan Vazquez

package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);

        int n1,n2,n3;

        System.out.print("\n digita tres numeros:\n->");
        n1 = jin.nextInt();
        n2 = jin.nextInt();
        n3 = jin.nextInt();

        System.out.print("\n---OPCIONES---\n1. ordenar de mayor a menor\n2. ordenar de menor a mayor\n->");
        int opcion = jin.nextInt();

        switch(opcion){

            case 1: {
                if (n1>n2 && n2>n3) {
                System.out.println("orden: " + n1 + ", " + n2 + ", " + n3);
                }else if (n1>n3 && n3>n2) {
                    System.out.println("orden: " + n1 + ", " + n3 + ", " + n2);
                }else if (n2>n1 && n1>n3) {
                    System.out.println("orden: " + n2 + ", " + n1 + ", " + n3);
                }else if (n2>n3 && n3>n1) {
                    System.out.println("orden: " + n2 + ", " + n3 + ", " + n1);
                }else if (n3>n1 && n1>n2) {
                    System.out.println("orden: " + n3 + ", " + n1 + ", " + n2);
                }else if (n3>n2 && n2>n1) {
                    System.out.println("orden: " + n3 + ", " + n2 + ", " + n1);
                }
                break;
            }

            case 2: {
                if (n1<n2 && n2<n3) {
                    System.out.println("orden: " + n1 + ", " + n2 + ", " + n3);
                }else if (n1<n3 && n3<n2) {
                    System.out.println("orden: " + n1 + ", " + n3 + ", " + n2);
                }else if (n2<n1 && n1<n3) {
                  System.out.println("orden: " + n2 + ", " + n1 + ", " + n3);
                } else if (n2<n3 && n3<n1) {
                    System.out.println("orden: " + n2 + ", " + n3 + ", " + n1);
                } else if (n3<n1 && n1<n2) {
                    System.out.println("orden: " + n3 + ", " + n1 + ", " + n2);
                } else if (n3<n2 && n2<n1) {
                    System.out.println("orden: " + n3 + ", " + n2 + ", " + n1);
                }
                break;
            }
        }
    }
}