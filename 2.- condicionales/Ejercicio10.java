//EJERCICIO 10: PEDIR EL DIA, MES Y AÑO DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA. CON MESES DE 28, 30 Y 31 DIAS. SIN AÑOS BISIESTOS
//Johan Vazquez
package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        
        int dia, mes, año;
        
        System.out.print("\ndigita una fecha en el siguiente orden: DD/MM/AAAA\n->");
        dia = jin.nextInt();
        mes = jin.nextInt();
        año = jin.nextInt();
        
        if(mes!=0){
            if(mes == 2){
                if(dia>=1 && dia <=28){
                    if(año>0){
                        System.out.println("fecha correcta");
                    }else{
                        System.out.println("fecha incorrecta, año incorrecto");
                    }
                }else{
                    System.out.println("fecha incorrecta, dia incorrecto");
                }
                
            }else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                if(dia>=1 && dia <=31){
                    if(año>0){
                        System.out.println("fecha correcta");
                    }else{
                        System.out.println("fecha incorrecta, año incorrecto");
                    }
                }else{
                    System.out.println("fecha incorrecta, dia incorrecto");
                }
                
            }else if(mes==4 || mes==6 || mes==9 || mes==11){
                if(dia>=1 && dia <=30){
                    if(año>0){
                        System.out.println("fecha correcta");
                    }else{
                        System.out.println("fecha incorrecta, año incorrecto");
                    }
                }else{
                    System.out.println("fecha incorrecta, dia incorrecto");
                }
            }
        }
    }
}