//Ejercicio 6: Pasar de segundos a días, horas y minutos. Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minutos
import java.util.Scanner;
public class Ejercicio6 {
    public static int pasar(int segundos, String tipo){
        int resultado = 0;
        switch (tipo) {
            case "dias":
                resultado = segundos / (24*3600);
                System.out.println("El total de segundos a dias son: " + resultado);
                break;
            case "horas":
                resultado = segundos / 3600;
                System.out.println("El total de segundos a horas son: " + resultado);
                break;
            case "minutos":
                resultado = segundos / 60;
                System.out.println("El total de segundos a minutos son: " + resultado);
                break;
            default:
                System.out.println("No digito bien el tipo de dato que desea calcular (dia, horas o minuto)");
                break;
        }
       return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Porfavor digite los segundos a pasar");
        int segundos = teclado.nextInt();
        System.out.println("Porfavor escriba a que desea pasar(dias, horas o minutos)");
        String tipo = teclado.next().toLowerCase();

        int resultado = pasar(segundos, tipo);
        System.out.println("El resultado de convertir " + segundos + " segundos a " + tipo + " es: " + resultado + " " + tipo);
    }
}
