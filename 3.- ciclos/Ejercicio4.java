//EJERCICIO 4: PEDIR NUMEROS HASTA QUE SE TECLEE UNO NEGATIVO, Y MOSTRAR CUANTOS NUMEROS SE HAN INTRODUCIDO.
//Johan Vazquez

package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int contador_numeros=0;
        
        System.out.print("\ndigita un numero, si es negativo el programa se detendra\n\t-->");
        int numero = jin.nextInt();
            
        while(numero>=0){
            contador_numeros++;
            System.out.print("\ndigita otro numero o acaba el programa\n\t-->");
            numero = jin.nextInt();
        }
        System.out.println("\nTotal de numeros digitados: " + contador_numeros);
    }
}
