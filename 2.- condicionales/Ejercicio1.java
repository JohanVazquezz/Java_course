//EJERCICIO 1: HACER UN PROGRAMA QUE LEA UN NUMERO ENTERO Y MUESTRE SI EL NUMERO ES MULTIPLO DE 10
//Johan Vazquez

package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] args){
        Scanner jin = new Scanner(System.in);

        System.out.print("\ndigita un numero\n->");
        int numero = jin.nextInt();

        if(numero%10 == 0){
            System.out.println("tu numero SI es multiplo de 10");
        }else{
            System.out.println("tu numero NO es multiplo de 10");
        }
    }
}
