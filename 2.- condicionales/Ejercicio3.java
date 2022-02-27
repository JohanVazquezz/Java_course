//EJERCICIO 3: HACER UN PROGRAMA QUE LEA UN CARACTER POR TECLADO Y COMPRUEBE SI ES UNA LETRA MAYUSCULA
//Johan Vazquez

package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[] args){
        Scanner jin = new Scanner(System.in);

        System.out.print("\ndigita una letra:\n->");
        char letra = jin.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("es mayuscula");
        }else{
            System.out.println("es miniscula");
        }
    }
}