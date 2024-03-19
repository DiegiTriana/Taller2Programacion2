//Ejercicio 5: Pasar de días, horas y minutos a segundos. Escribe un metodo que reciba los siguientes datos: días, horas y minutos. 
//Y retorne con la cantidad de segundos totales que son esos datos.

import java.util.Scanner;

public class Ejercicio5 {
    public static int pasarSegun(int dias, int horas, int minutos){

        int diaAsegundo = dias * (24 * 3600);
        int horaAsegundo = horas * 3600;
        int minutoAsegundo = minutos * 60;
        int segunTotal = diaAsegundo + horaAsegundo + minutoAsegundo;
        return segunTotal;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite la cantidad de dias");
        int dias = teclado.nextInt();
        System.out.println("Digite la cantidad de horas");
        int horas = teclado.nextInt();
        System.out.println("Digite la cantidad de minutos");
        int minutos = teclado.nextInt();

        int segunTotal = pasarSegun(dias, horas, minutos);
        System.out.println("El resultado en segundos de sumar los dias, horas y minutos es de: " + segunTotal + " segundos");
    }
}
 