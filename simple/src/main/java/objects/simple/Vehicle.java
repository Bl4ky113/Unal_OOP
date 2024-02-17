
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
}
