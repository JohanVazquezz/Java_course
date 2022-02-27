//EJERCICIO 2: PEDIR DOS NUMEROS Y DECIR CUAL ES EL MAYOR O SI SON IGUALES
//Johan Vazquez

package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        Scanner jin = new Scanner (System.in);

        System.out.print("\ndigite dos numeros:\n-> ");
        int x = jin.nextInt();
        int y = jin.nextInt();

        if (x==y){
            System.out.print("ammbos numeros son iguales");
        }else if(x > y){
            System.out.println("RE: " + x + " es mayor que " + y);
        }else{
            System.out.println("RE: " + x + " es menor que " + y);
        }
    }
}