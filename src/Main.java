import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main mainProgram = new Main();
        mainProgram.inicio();
    }


    public void inicio() {

        int menuOption = 0;
        boolean exit = false;

        System.out.println("Bienvenidos al gestor eventos");
        String menu = "[1] Añadir evento:  \n" +
                "[2] Borrar evento: \n" +
                "[3] Listar eventos:  \n" +
                "[4] Listar eventos:  \n" +
                "[5] Salir";
        do {
            menuOption = getIntFromConsole(menu, 1, 5);
            switch (menuOption) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit = true;
                    break;
            }
        } while (!exit);
    }


    public int getIntFromConsole(String mensaje, int valueMin, int valueMax) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        boolean exit = false;
        do {
            System.out.println(mensaje);
            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine();
                if (value >= valueMin && value <= valueMax) {
                    exit = true;
                }
            } else {
                System.out.println("Error. Debes introducir un valor entero");
                input.nextLine();
            }
        } while (!exit);
        return value;
    }

}
