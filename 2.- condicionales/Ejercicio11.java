//EJERCICIO 11: HACER UN PROGRAMA QUE SIMULE UN CAJERO AUTOMATICO CON UN SALDO INICIAL DE 1000 DOLARES, CON EL SIGUIENTE MENU DE OPCIONES: 1.INGRESAR DINERO A LA CUENTA 2.RETIRAR DINERO 3. SALIR
//Johan Vazquez

package ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        float saldo= 1000f, ingreso, retiro;
        
        System.out.print("\n¿Desea ingresar al cajero automatico?, digite un numero diferente de 0 para acceder\n\t->");
        int desicion = jin.nextInt();
        
        if(desicion!=0){
            System.out.print("\n\n----CAJERO AUTOMATICO----\n saldo actual: " + saldo + "\nseleccione una opcion:\n1.ingresar dinero\n2.retirar dinero\n3.salir\n\t->");
            int desicion2= jin.nextInt();
            
            switch(desicion2){
                case 1: {
                    System.out.print("digite el monto del ingreso\n\t->");
                    ingreso = jin.nextFloat();
                    saldo+= ingreso;
                    break;
                }
                case 2: {
                    System.out.print("digite el monto del retiro\n\t->");
                    retiro = jin.nextFloat();
                    saldo-= retiro;
                    break;
                }
                case 3: {
                    System.out.println("\t0 modifiaciones");
                    break;
                }
                default: {
                    System.out.println("OPCION INVALIDA");
                }
            }
            
            System.out.println("\n\n----CAJERO AUTOMATICO----\n saldo actual: " + saldo + "\nFIN DE LA OPERACION");
            
        }else{
            System.out.println("sera en otro momento");
        }
    }
}