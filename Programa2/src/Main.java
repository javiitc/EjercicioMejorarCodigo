import java.util.Scanner;

public class Main {
    // El código pide un numero del 1 al 10 para ver si coincide con el numero x, el cual es generado aleatoriamente, si el numero introducido coincide con x,
    //se considera que ha ganado el premio (como si fuera un sorteo), si no coinciden muestra un mensaje agradeciendo por participar, y si se introduce un valor
    //mayor que 10, avisará que el número no es válido
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = (int)(Math.random() * 10 + 1);
        System.out.println("Introduzca un numero del 1 al 10");
    int y = 0;
    String frase = "Enhorabuena, usted ha obtenido el premio";
    String frase2 = "El numero introducido no coincide con el numero ganador, gracias por participar!";
    String frase3 = "Numero no valido, intentelo de nuevo";
    while (y != x) {
        y = s.nextInt();
        if (y == x)
            System.out.println(frase);
        else if (y > 10)
            System.out.println(frase3);
        else if (y != x)
            System.out.println(frase2);
        else
            System.out.println(frase3);
        break;
    }
}}