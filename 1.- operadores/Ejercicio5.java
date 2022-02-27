//EJERCICIO 5: LA CALIFICACION FINAL DE UN ESTUDIANTE DE INFORMATICA SE CALCULA CON BASE A LAS CALIFICACIONES DE CUATRO ASPECTOS DE SU RENDIMIENTO ACADEMICO: PARTICIPACION, PRIMER EXAMEN PARCIAL, SEGUNDO EXAMEN PARCIAL Y EXAMEN FINAL. SABIENDO QUE LAS CALIFICACIONES ANTERIORES ENTRAN A LA CALIFICACION FINAL CON PONDERACIONES DEL 10%, 25%, 25% Y 40$, HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA CALIFIACION OBTENIDA POR UN ESTUDIANTE
//Johan Vazquez

package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String[] args){
        Scanner jin = new Scanner (System.in);

        float participacion, parcial1, parcial2, ex_final, calificacion;

        System.out.print("digita tus calificaciones en el siguiente orden: \n-Participacion: \n-parcial 1: \n-parcial 2: \n-examen final: \n->");
        participacion = jin.nextFloat();
        parcial1 = jin.nextFloat();
        parcial2= jin.nextFloat();
        ex_final = jin.nextFloat();

        participacion = (participacion / 100) * 10;
        parcial1 = (parcial1 / 100) * 25;
        parcial2= (parcial2 / 100) * 25;
        ex_final = (ex_final / 100) * 40;
        calificacion = participacion + parcial1 + parcial2 + ex_final;

        System.out.println ("\n\n--TUS CALIFICACIONES-- \n\n-Participacion: " + participacion + " \n-parcial 1: " + parcial1 + "\n-parcial 2 :" + parcial2 + "\n-examen final: " + ex_final + "\n\n-promedio: " + calificacion);
    }
}