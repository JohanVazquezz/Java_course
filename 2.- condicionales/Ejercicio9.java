//EJERCICIO 9: PEDIR EL DIA, MES Y AÑO DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA. SUPONIENDO QUE TODOS LOS MESES SON DE 30 DIAS
//Johan Vazquez

package ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[]args) {
        Scanner jin = new Scanner(System.in);
        
        int dia, mes, año;
        
        System.out.print("\ndigita el dia: \n\t->");
        dia = jin.nextInt();
        System.out.print("\ndigita el mes: \n\t->");
        mes = jin.nextInt();
        System.out.print("\ndigita el año: \n\t->");
        año = jin.nextInt();
        
        if (dia >= 1 && dia <=31){
            if (mes >=1 && mes <=12){
                if (año != 0){
                    System.out.println("fecha correcta");
                }else{
                    System.out.println("fecha incorrecta, año incorrecto");
                }
            }else{
                System.out.println("fecha incorrecta, mes incorrecto");
            }
        }else{
            System.out.println("fecha incorecta, dia incorrecto");
        }
    }
}
