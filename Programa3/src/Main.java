import java.util.Scanner;

public class Main {
    // El siguiente código actua como si fuera un cajero (muy simple y con operaciones limitadas), el cual segun la acción que le indiques, podrás mover dinero
    // a determinadas cuentas, consultar el dinero disponible en las diferentes cuentas, o terminar de operar.
    // En caso de seleccionar una operación no disponible (un numero mayor que 5), saltará un mensaje de que la operación no es válida, y que se
    // seleccione una que si lo sea.
    // Si la cuenta principal 'g' llega a 0, automaticamente saltará un mensaje de saldo insuficiente, mostrará el dinero disponible en las cuentas y terminará
    // el programa.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = 50; // saldo disponible cuenta personal/facturas
        int e = 0; //saldo disponible, cuenta de empresa
        int a = 0; // saldo disponible, cuenta de ahorro
        int i = 0; // saldo disponible cuenta de inversion
        int c = 0; //saldo disponible para gastos personales
        boolean x = true;
        System.out.println("Seleccione 1 para mover 10€ de su cuenta principal e ingresarlo equitativamente a sus cuentas de empresa y ahorro");
        System.out.println("Seleccione 2 para mover 7€ de su cuenta principal e ingresar 3€ en su cuenta de empresa y 4€ a inversión");
        System.out.println("Seleccione 3 para mover 20€ de su cuenta principal e ingresarlo equitativamente en su cuenta de empresa e inversión ");
        System.out.println("Seleccione 4 para consultar sus cuentas");
        System.out.println("Seleccione 5 para salir de las operaciones");
        System.out.println("1 2 3 4 5");
        while (x) {
            int n = s.nextInt();
            if (n == 1) {
                if (g >= 10) {
                    g = g - 10;
                    e = e + 5;
                    a = a + 5;
                } else {
                    System.out.println("Saldo insuficiente para continuar con la operación");
                }
            } else if (n == 2) {
                if (g >= 7) {
                    g = g - 7;
                    e = e + 3;
                    i = i + 4;
                } else {
                    System.out.println("Saldo insuficiente para continuar con la operación");
                }
            } else if (n == 3) {
                if (g >= 20) {
                    g = g - 20;
                    e = e + 10;
                    c = c + 10;
                } else {
                    System.out.println("Saldo insuficiente para continuar con la operación");
                }
            } else if (n == 4) {
                System.out.println("Cuenta personal: " + g +"€");
                System.out.println("Cuenta de empresa: " + e + "€");
                System.out.println("Cuenta de ahorro: " + a + "€");
                System.out.println("Cuenta de inversion: " + i + "€");
                System.out.println("Cuenta de gastos personales" + c + "€");
            } else if (n == 5) {
                System.out.println("Cerrando sesión, gracias por usar nuestros servicios!");
                x = false;
            } else if (n > 5) {
                System.out.println("Seleccione una operación válida");
            }
            if (g == 0) {
                System.out.println("Saldo insuficiente en su cuenta principal");
                System.out.println("Cuenta personal: " + g +"€");
                System.out.println("Cuenta de empresa: " + e + "€");
                System.out.println("Cuenta de ahorro: " + a + "€");
                System.out.println("Cuenta de inversion: " + i + "€");
                System.out.println("Cuenta de gastos personales" + c + "€");
                x = false;
            }
        }
    }
}