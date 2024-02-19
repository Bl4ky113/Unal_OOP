
package objects.simple;

public class Vehicle {
	String placa;
	String marca;
	String modelo;
	String color;

	public Vehicle (String placa, String marca, String modelo, String color) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
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
}
