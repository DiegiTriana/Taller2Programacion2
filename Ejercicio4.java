//Ejercicio 4: Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. Suponiendo que pi = 3.1416. 
//Escribe un metodo que reciba el radio y el tipo de calculo, y retorne el cálculo del perímetro de la circunferencia (2*pi*r) 
//o el área del círculo (pi*r2 ) o el volumen de la esfera (V = 4*pi*r3 /3).

import java.util.Scanner;
public class Ejercicio4 {
    public static double calcular(double radio , String tipoCal)
    {
        double pi = 3.1416;
        double resultado = 0.0;

        switch (tipoCal) {
            case "perimetro":
                resultado = 2*pi*radio;
                break;

            case "area":
                resultado = pi * (Math.pow(radio, 2));
                break;
            
            case "volumen":
                resultado = (4 * pi * (Math.pow(radio, 3))) / 3;
                break;
            default:
                System.out.println("No digito un tipo de calculo");
                break;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el valor del radio");
        double radio = teclado.nextDouble();
        System.out.println("digite que desea calcular (perimetro, area o volumen)");
        String tipoCal = teclado.next().toLowerCase();

        double resultado = calcular(radio, tipoCal);
        System.out.println("La operacion a realizar es el " + tipoCal + " y el resultado de la operacion es: " + resultado);
    }
}
