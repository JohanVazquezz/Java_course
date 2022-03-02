//EJERCICIO 3: LEER NUMEROS HASTA QUE SE INTRODUZCA UN 0. PARA CADA UNO INDICAR SI ES PAR O IMPAR
//Johan Vazquez

package ejercicio3;
import java.util.Scanner;

public class Ejercicio3{
  
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        System.out.print("\ndigita un numero, si deseas acabar digita 0 \n\t-->");
        int numero = jin.nextInt();
        
        while(numero!=0){
            if(numero % 2 == 0){
                System.out.print("\n" + numero + " es par");
            }else{
                System.out.print("\n" + numero +" es impar");
            }
            
            System.out.print("\ndigita otro numero o acaba el programa\n\t-->");
            numero = jin.nextInt();
        }
    }
}
