import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de puntos a generar: ");
        int puntosTotales = input.nextInt();
        input.close();

        int aciertos = 0;
        double x, y, d;
        Random rnd = new Random();
        for (int i = 0; i < puntosTotales; i++) {
            x = rnd.nextDouble() * 2 - 1; // Genera un número aleatorio entre -1 y 1
            y = rnd.nextDouble() * 2 - 1; // Genera un número aleatorio entre -1 y 1
            d = Math.sqrt(x * x + y * y); // Calcula la distancia entre el punto y el centro del círculo
            if (d <= 1) { // Si el punto está dentro del círculo
                aciertos++;
            }
        }
        double pi = 4.0 * aciertos / puntosTotales;
        System.out.println("La aproximación de pi es: " + pi);
    }
}