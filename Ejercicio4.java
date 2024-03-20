//Ejercicio 4: Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. Suponiendo que pi = 3.1416. 
//Escribe un metodo que reciba el radio y el tipo de calculo, y retorne el cálculo del perímetro de la circunferencia (2*pi*r) 
//o el área del círculo (pi*r2 ) o el volumen de la esfera (V = 4*pi*r3 /3).

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
    public static double calcular2(double radio2 , String tipoCal2)
    {
        double pi2 = 3.1416;
        double resultado2 = 0.0;

        switch (tipoCal2) {
            case "perimetro":
                resultado2 = 2 * pi2 * radio2;
                break;

            case "area":
                resultado2 = pi2 * (Math.pow(radio2, 2));
                break;
            
            case "volumen":
                resultado2 = (4 * pi2 * (Math.pow(radio2, 3))) / 3;
                break;
            default:
                System.out.println("No digito un tipo de calculo");
                break;
        }
        return resultado2;
    }
    public static void main(String[] args) {
        
        double radio = 40;
        double radio2 = 299;
        String tipoCal = "perimetro".toLowerCase();
        String tipoCal2 = "area".toLowerCase();
        double resultado = calcular(radio, tipoCal);
        System.out.println("La operacion a realizar es el " + tipoCal + " y el resultado de la operacion es: " + resultado);
        System.out.println("");
        double resultado2 = calcular2(radio2, tipoCal2);
        System.out.println("La operacion a realizar es el " + tipoCal2 + " y el resultado de la operacion es: " + resultado2);
    }
    

}
