import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int v = 30, m = 30, d = 5, f = 0;
        boolean a = true;
        System.out.println("Seleccione el objeto a usar");
        System.out.println("1- Piedra de ira: Aumenta el poder de la ira espartana a cambio de salud");
        System.out.println("2- Piedra de salud S: Recupera 10 puntos de HP");
        System.out.println("3- Piedra de salud M: Recupera todos los puntos de HP");
        System.out.println("4- Invoca la hoja del olimpo (+ fuerza +daño recibido)");
        System.out.println("0- Salir del menú");
        while (a) {
            int o = s.nextInt();

            if (o == 0) break;


            if (o == 1) {
                v -= 3 + r.nextInt(5);
                f += 5 + r.nextInt(7);
                if (f >= 50 && f % 50 < 10) d += 2;
                System.out.println("Vida restante: " + v);
                System.out.println("Fuerza: " + f);
            }

            if (o == 2) {
                v += 10;
                if (v > m) v = m;
                System.out.println("Has recuperado 10 puntos de salud!");
                System.out.println("Vida restante: " + v);
            }

            if (o == 3) {
                v = m;
                System.out.println("Salud restaurada al completo!");
            }

            if (o == 4) {
                f += 20 + r.nextInt(7);
                d += f / 100;
                System.out.println("Fuerza: " + f);
                System.out.println("Daño por golpe recibido:" + d);
            }

            if (v <= 0) {
                System.out.println("Has muerto");
                System.out.println("Reintentar?");
                a = false;
            }
        }


}
}
