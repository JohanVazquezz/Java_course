//EJERCICIO2: LEER UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO. EL PROCESO SE REPETIRA HASTA QUE SE INTRODUZCA UN 0
//Johan Vazquez

package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner jin = new Scanner (System.in);
        
        System.out.print("\ndigite un numero; si es 0 el programa se detendra\n\t-->");
        int numero = jin.nextInt();
        
        while(numero!=0){
            if (numero > 0){
                System.out.println("el numero " + numero + " es positivo");
            }else{
                System.out.println("el numero " + numero + " es negativo");
            }
            System.out.println("\ndigita otro numero\n\t-->");
            numero = jin.nextInt();
        }
    }
}
