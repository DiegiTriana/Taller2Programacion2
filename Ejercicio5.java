//Ejercicio 5: Pasar de días, horas y minutos a segundos. Escribe un metodo que reciba los siguientes datos: días, horas y minutos. 
//Y retorne con la cantidad de segundos totales que son esos datos.

public class Ejercicio5 {
    public static int pasarSegun(int dias, int horas, int minutos){

        int diaAsegundo = dias * (24 * 3600);
        int horaAsegundo = horas * 3600;
        int minutoAsegundo = minutos * 60;
        int segunTotal = diaAsegundo + horaAsegundo + minutoAsegundo;
        return segunTotal;
    }
    public static int pasarSegun2(int dias2, int horas2, int minutos2){

        int diaAsegundo2 = dias2 * (24 * 3600);
        int horaAsegundo2 = horas2 * 3600;
        int minutoAsegundo2 = minutos2 * 60;
        int segunTotal2 = diaAsegundo2 + horaAsegundo2 + minutoAsegundo2;
        return segunTotal2;
    }

    public static void main(String[] args) {
        
        int dias = 10;
        int horas = 14;
        int minutos = 30;
        int segunTotal = pasarSegun(dias, horas, minutos);

        int dias2 = 5;
        int horas2 = 20;
        int minutos2 = 15;
        int segunTotal2 = pasarSegun2(dias2, horas2, minutos2);

        System.out.println("El resultado en segundos de sumar los dias, horas y minutos es de: " + segunTotal + " segundos");
        System.out.println("");
        System.out.println("El resultado en segundos de sumar los dias, horas y minutos es de: " + segunTotal2 + " segundos");
    }
}
 