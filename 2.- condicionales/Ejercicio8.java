//EJERCICIO 8: PEDIR UN NUMERO ENTRE 0 Y 99,999 Y DECIR CUANTAS CIFFRAS TIENE
//Johan Vazquez

package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main (String[] args){
        Scanner jin = new Scanner(System.in);

        System.out.print("\ndigita un numero del 0 al 99,999:\n->");
        int x = jin.nextInt();

        int cifras = 0;

        if (x > 0 && x < 100000) {
            while (x>0) {
                x /= 10;
                cifras++;
            }
        }else{
            System.out.print("\nel numero excede el programa, intente con un numero entre 0 y 99,999");
        }

        System.out.print("\nnumero de cifras: " + cifras);
    }
}