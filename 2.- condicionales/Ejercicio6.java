//EJERCICIO 6: HACER UN PROGRAMA QUE TOME DOS NUMEROS Y DIGA SI AMBOS SON PARES O IMPARES
//Johan Vazquez

package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args){
        Scanner jin = new Scanner(System.in);

        System.out.print("\ndigita dos numeros:\n->");
        int x = jin.nextInt();
        int y = jin.nextInt();
        String resultado1;
        String resultado2;

        if (x%2==0) {
            resultado1 = "par";
        } else {
            resultado1 = "impar";
        }

        if (y%2==0){
            resultado2 = "par";
        } else {
            resultado2 = "impar";
        }

        System.out.println(x + " es " + resultado1 + "\n" + y + " es " + resultado2);
    }
}