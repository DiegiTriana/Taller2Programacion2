//Ejercicio 6: Pasar de segundos a días, horas y minutos. Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minutos

public class Ejercicio6 {
    public static int pasar(int segundos, String tipo){
        int resultado = 0;
        switch (tipo) {
            case "dias":
                resultado = segundos / (24*3600);
                
                break;
            case "horas":
                resultado = segundos / 3600;
                
                break;
            case "minutos":
                resultado = segundos / 60;
                
                break;
            default:
                System.out.println("No digito bien el tipo de dato que desea calcular (dia, horas o minuto)");
                break;
        }
       return resultado;
    }
    public static int pasar2(int segundos2, String tipo2){
        int resultado2 = 0;
        switch (tipo2) {
            case "dias":
                resultado2 = segundos2 / (24*3600);
                
                break;
            case "horas":
                resultado2 = segundos2 / 3600;
                
                break;
            case "minutos":
                resultado2 = segundos2 / 60;
                
                break;
            default:
                System.out.println("No digito bien el tipo de dato que desea calcular (dia, horas o minuto)");
                break;
        }
       return resultado2;
    }
    public static void main(String[] args) {
        

      
        int segundos = 90000;
        int segundos2 = 3590;
        String tipo = "dias";
        String tipo2 = "minutos";

        int resultado = pasar(segundos, tipo);
        System.out.println("El resultado de convertir " + segundos + " segundos a " + tipo + " es: " + resultado + " " + tipo);
        int resultado2 = pasar2(segundos2, tipo2);
        System.out.println("El resultado de convertir " + segundos2 + " segundos a " + tipo2 + " es: " + resultado2 + " " + tipo2);
    }
}
