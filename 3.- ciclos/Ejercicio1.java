//EJERCICIO 1: LEER UN NUMERO Y MOSTRAR SU CURADRADO, REPETIR EL PROCESOS HASTA QUE SE INTRODUZCA UN NUMERO NEGATIVO
//Johan Vazquez

package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        int numero, cuadrado;
        
        System.out.print("digita un numero \n\t-->");
        numero = jin.nextInt();
        
        while(numero >= 0){
            cuadrado = (int) Math.pow(numero,2);
            System.out.print("el cuadrado del numero " + numero + " es " + cuadrado +
                "\ndigita otro numero\n\t-->");
            numero = jin.nextInt();
        }
    }
}
