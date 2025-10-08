import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int v = 30, m = 30, d = 5, x = 0;
        boolean a = true;

        while (a) {
            System.out.println("Seleccione el objeto a usar");
            System.out.println("1- Piedra de ira: Aumenta el poder de la ira espartana a cambio de salud");
            System.out.println("2- Piedra de salud S: Recupera 10 puntos de HP");
            System.out.println("3- Piedra de salud M: Recupera todos los puntos de HP");
            System.out.println("4- Hoja del Olimpo: ");
            System.out.println("0- Salir del menú");
            int o = s.nextInt();

            if (o == 0) break;


            if (o == 1) {
                v -= 3 - r.nextInt(5);
                x += 5 + r.nextInt(7);
                if (x >= 50 && x % 50 < 10) d += 2;
            }

            if (o == 2) {
                v += 10;
                if (v > m) v = m;
            }

            if (o == 3) v = m;

            if (o == 4) {
                x += 5 + r.nextInt(7);
                d += x / 100;
            }

            if (v <= 0) a = false;
        }


}
}
