
package objects.main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  static public void main (String[] args) {
    start_Menu();
  }

  static public void print_Menu () {
    System.out.printf("\n===Inventario de Carros el \033[1mkrakeko\033[0m===\n\nOPCIONES:\n\033[1;31m 1 \033[0m:\tIngresar un nuevo carro\n\033[1;35m 2 \033[0m:\tMirar carros ingresados\n\033[1;34m 3 \033[0m:\tCerrar Programa \033[1mkrakeko\033[0m\n\n 4 :\tAyuda. Volver a mostrar el Menu\n");
  }

  static public void start_Menu() {
    // Morire, pero llamar scanner a scanner es lo apropiado y lo CORRECTO
    // inputScanner tampoco esta mal, pero con la syntaxis del querido_Profesor, nah
    Scanner scanner = new Scanner(System.in); 
    Inventory inventory = new Inventory();

    boolean menu_Running = true;

    print_Menu();

    while (menu_Running) {
      System.out.printf("\n\nIngresar opción del menu:   \033[1m");
      String user_Input = scanner.nextLine();
      System.out.printf("\033[0m");

      char menu_Option = user_Input.charAt(0);

      switch (menu_Option) {
        case '1':
          String[] user_Input_Arr = user_Input.split("&");

          if (user_Input_Arr.length != 5) {
            System.out.printf("\n\033[1mDatos insuficientes al inscribir el carro\033[0m");
            break;
          }

          if (inventory.add_Car(user_Input_Arr) != 0) {
            System.out.printf("\n\033[1;31mERROR al ingresar los datos del carro\033[0m");
          }
          break;
        case '2':
          ArrayList<Vehicle> stored_Cars = inventory.get_All_Cars();

          if (stored_Cars == null) {
            System.out.printf("\n\033[1mNo hay carros en el inventario\033[0m");
            break;
          }

          print_Cars(stored_Cars.iterator(), stored_Cars.size());

          break;
        case '3':
          menu_Running = false;
          break;
        case '4':
          print_Menu();
          break;
        default:
          print_Menu();
          System.out.printf("\n\t\033[1mSeleccione una opción valida\033[0m");
          break;
      }
    }

    System.out.printf("\n\n\033[1;31mHasta pronto\033[0m\n\n");

    scanner.close();
    return;
  }

  static public void print_Cars (Iterator<Vehicle> car_Iter, int car_Iter_Length) {
    System.out.printf("\n\nNúmero de carros ingresados: \t\033[1m%d\033[0m\n", car_Iter_Length);
    System.out.printf("Placa |\t V. Max |\t N. Pasajeros |\t Color/Capacidad (kg)\n");

    while (car_Iter.hasNext()) {
      Vehicle car = car_Iter.next();
      System.out.println(car.toString());
    }
  }
}
