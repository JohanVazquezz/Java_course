//EJERCICIO 2: HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO SEMANAL DE UN EMPLEADO A PARTIR DE SUS HORAS SEMANALES TRABAJADAS Y DE SU SALARIO POR HORA
//Johan Vazquez

package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

  public static void main (String[] args) {
    Scanner jin = new Scanner (System.in);

    int horas_x_semana, salario_x_hora, salario_semanal;

    System.out.println("digite su salario por hora: ");
    salario_x_hora = jin.nextInt();
    System.out.println("digite las horas semanales trabajadas: ");
    horas_x_semana = jin.nextInt();

    salario_semanal = salario_x_hora * horas_x_semana;
    System.out.println("salario semanal: " + salario_semanal);
  }
}