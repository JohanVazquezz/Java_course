//EJERCICIO 5: UN OBRERO NECESITA CALCULAR SU SALARIO SEMANAL, EL CUAL SE OBTIENE DE LA SIGUIENTE MANERA: SI TRABAJA 40 HORAS O MENOS SE LE PAGA $16 POR HORA, SI TRABAJA MAS DE 40 HORAS SE LE PAGA $16 POR CADA UNA DE LAS PRIMERAS 40 HORAS Y $20 POR CADA HORA EXTRA
//Johan Vazquez

package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);

        int sueldo;

        System.out.print("\nDigita el numero de horas trabajadas a la semana:\n->");
        int horas = jin.nextInt();

        if (horas <=40){
            sueldo = horas * 16;
            System.out.println("\nSUELDO SEMANAL: " + sueldo);
        }else{
            sueldo= (40*16) + ((horas-40) * 20);
            System.out.println("\nSUELDO SEMANAL: " + sueldo);      
        }
    }
}