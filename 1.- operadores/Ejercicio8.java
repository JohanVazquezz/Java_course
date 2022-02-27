//EJERCICIO 8: CONSTRUIR UN PRGRAMA QUE CALCULE Y MUESTRE POR PANTALLA LAS RAICES DE LA ECUACUION DE SEGUNDO GRADO DE COEFICIENTES REALES
//Johan Vazquez

package ejercicio8;
import java.util.Scanner;

public class Ejercicio8{

  public static void main (String[] args){
    Scanner jin = new Scanner (System.in);
    
    double x1, x2, a, b, c;

    System.out.print("\n\ndigita los tres numeros de la ecuacion de segundo grado de coeficientes reales en el siguiente orden: \n\na: \nb: \nc: \n->");
    a = jin.nextDouble();
    b = jin.nextDouble();
    c = jin.nextDouble();

    x1= (- (b) + (Math.sqrt((Math.pow(b,2)) - 4*(a)*(c))))  /  (2*(a));
    x2= (- (b) - (Math.sqrt((Math.pow(b,2)) - 4*(a)*(c))))  /    (2*(a));

    System.out.println("\n\n--RESULTADOS-- \n\nx1: " + x1 + "\nx2: " + x2);
  }
}