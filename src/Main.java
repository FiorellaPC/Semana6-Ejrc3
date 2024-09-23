import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");

        double temperatura;
        double sumaTemperatura = 0;
        int conteoDias = 0;

        System.out.println("Ingrese las temperaturas diarias. Ingrese 0 si el sensor está dañado.");

        while (true){
            System.out.println("Ingrese temperatura del día: ");
            temperatura = scan.nextDouble();

            if (temperatura == 0){
                break;
            }
            sumaTemperatura = sumaTemperatura + temperatura;
            conteoDias = conteoDias + 1;
        }
        if (conteoDias == 0){
            System.out.println("No se registraron temperaturas");
        } else {
            double promedio = sumaTemperatura / conteoDias;
            System.out.println("Promedio de las temperaturas registradas: "+decimal.format(promedio)+"°C");
        }
    }
}