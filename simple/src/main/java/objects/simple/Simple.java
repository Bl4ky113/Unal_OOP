
package objects.simple;

public class Simple {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Vehicle carro = new Vehicle("MNF046", "Cheverolet", "idk", "Gris");

    System.out.printf("%s\t%s\n", carro.placa, carro.color);

    Engine motor = new Engine("123456", 128);

    System.out.printf("%s\t%d\n", motor.num_Motor, motor.cilindraje);

    System.out.printf("Metodos de Motor:\n");
    motor.turbo();

    System.out.printf("Metodos de Vehiculo:\n");
    carro.acelerar();
    carro.frenar();
    carro.girar();

    Simple simple_Obj = new Simple();
    // Esto dado a que, ni yo ni algunos compañeros que les pregunte 
    // sobre la tarea, sabemos a que se refiere especificamente 'implementar'
    // los metodos en la clase Simple
    System.out.printf("Implementación de los metodos en la Clase Simple\n\n");
    System.out.printf("Metodos de 'Motor'\n");
    simple_Obj.turbo();
    System.out.printf("Metodos de Vehiculo\n");
    simple_Obj.acelerar();
    simple_Obj.frenar();
    simple_Obj.girar();
    System.out.printf("Metodos de 'Simple'\n");
    simple_Obj.tell_A_Joke(true);
  }

	public void turbo () {
		System.out.printf("A todo gas, dijo Vin Gasolina Corriente\n");
		return;
	}

	public void acelerar () {
		System.out.printf("Estoy acelerando...\n");
		return;
	}

  public void frenar () {
    System.out.printf("Estoy Frenando...\n");
    return;
  }

  public void girar () {
    System.out.printf("Estoy girando...\n");
    return;
  }

  public void tell_A_Joke (boolean bad_Joke) {
    if (bad_Joke) {
      System.out.printf("\tHabían dos crakecos en una moto.\n\tPrimero se cayó el profesor Fernando Ospina,\n\tluego me caí yo,\n\ty al final se cayo la moto que estaba parqueada");
    } else {
      System.out.printf("sudo rm -fr /");
    }

    return;
  }
}
