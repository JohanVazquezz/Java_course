//EJERCICIO 1: HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE TRES CALIFICACIONES
//Johan Vazquez

package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {
    Scanner jin = new Scanner(System.in);

    float nota1, nota2, nota3, suma;

    System.out.println("digite 3 calificaciones: ");
    nota1= jin.nextFloat();
    nota2= jin.nextFloat();
    nota3= jin.nextFloat();

    suma = nota1+nota2+nota3;
    System.out.println(suma);
  }
}
