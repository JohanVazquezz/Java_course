//EJERCICIO 3: GUILLERMO TIENE N DOLARES. LUIS TIENE LA MITAD DE LO QUE POSEE GUILLERMO, JUAN TIENE LA MITAD DE LO QUE POSEEN LUIS Y GUILLERMO JUNTOS. HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CANTIDAD DE DINERO QUE TIENEN ENTRE LOS TRES
//Johan Vazquez

package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[] args) {
        Scanner jin = new Scanner (System.in);

        float guillermo, luis, juan, total;

        System.out.print("¿cuantos dolares tiene guillermo? \n->");
        guillermo = jin.nextFloat();

        luis = guillermo/2;
        juan = (guillermo + luis) / 2;
        total = guillermo + luis + juan;

        System.out.println ("\nGUILLERMO: " + guillermo);
        System.out.println ("LUIS: " + luis);
        System.out.println ("JUAN: " + juan);
        System.out.println ("TOTAL: " + total);
    }
}