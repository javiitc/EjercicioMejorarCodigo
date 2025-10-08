import java.util.Random;
import java.util.Scanner;

public class Main {
    //En este codigo se representa un 'menu' de objetos que puede utilizar el personaje, en el cual cada uno tiene un efecto distinto en sus ppt de salud,
    //fuerza y daño recibido. En el caso de seleccionar 0 se cerrará el menú y el códuigo finalizará.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int v = 30, m = 30, d = 5, f = 0;
        boolean a = true;
        System.out.println("Seleccione el objeto a usar");
        System.out.println("1- Piedra de ira: Aumenta el poder de la ira espartana a cambio de salud");
        System.out.println("2- Piedra de salud S: Recupera 10 puntos de HP");
        System.out.println("3- Piedra de salud M: Recupera todos los puntos de HP");
        System.out.println("4- Invoca la hoja del olimpo: Aumenta la fuerza considerablemente pero aumenta el daño recibido");
        System.out.println("0- Salir del menú");
        while (a) {
            int o = s.nextInt();

            if (o == 0) break;

//Para el objeto 1, restará puntos de salud y aumentará la fuerza, mostrando las estadisticas de vida y de fuerza despues de seleccionarlo.
// Sin embargo, si la vida llega a 0 o menos de 0, el programa marcará un game over.
            if (o == 1) {
                v -= 3 + r.nextInt(5);
                f += 5 + r.nextInt(7);
                if (f >= 50 && f % 50 < 10) d += 2;
                System.out.println("Vida restante: " + v);
                System.out.println("Fuerza: " + f);
            }
//En este caso, el objeto 2 te recupera 10 ppt de salud, mostrandote un aviso de ello y mostrando la vida restante
            if (o == 2) {
                v += 10;
                if (v > m) v = m;
                System.out.println("Has recuperado 10 puntos de salud!");
                System.out.println("Vida restante: " + v);
            }
//Este objeto recupera toda la salud
            if (o == 3) {
                v = m;
                System.out.println("Salud restaurada al completo!");
            }
//Seleccionar el objeto 4 aumentará mucho la estadistica de fuerza, pero también aumentará el daño recibido por el personaje (al seleccionarlo mostrará los
// puntos de fuerza y el daño que recibirá el personaje
            if (o == 4) {
                f += 20 + r.nextInt(7);
                d += f / 100;
                System.out.println("Fuerza: " + f);
                System.out.println("Daño por golpe recibido:" + d);
            }
            //Si se selecciona un numero mayor que 5, se mostrará un mensaje conforme en ese espacio no hay ningun objeto a usar
            if (o > 5) {
                System.out.println("Sin objeto asignado en el espacio " + o);
            }
//Cuando la v llegue a 0, se entiende que el personaje no sigue con vida, entonces el progrma muestra el mensaje correspondiente
            if (v <= 0) {
                System.out.println("Has muerto");
                System.out.println("Reintentar?");
                a = false;
            }
        }


}
}
