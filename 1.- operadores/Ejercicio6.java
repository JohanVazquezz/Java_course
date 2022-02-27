//EJERCICIO 6: HACER UN PROGRAMA QUE CALCULE EL CUADRADO DE UNA SUMA (A+B)al cuadrado = a al cruadrado + b al cuadrado + 2ab
//Johan Vazquez

package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args){
        Scanner jin = new Scanner (System.in);

        double a, b, resultado;

        System.out.print("\n\ndigita los dos numeros cual suma quieres elevar al cuadrado: \n->");
        a = jin.nextFloat();
        b = jin.nextFloat();

        resultado = ((Math.pow(a, 2)) + (Math.pow(b, 2)) + (2 * (a * b)));

        System.out.println("\n\n-> resultado: " + resultado);
    }
}