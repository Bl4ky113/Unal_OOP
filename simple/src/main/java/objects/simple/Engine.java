
package objects.simple;

public class Engine {
	String num_Motor;
	int cilindraje;

	public Engine (String num_Motor, int cilindraje) {
		this.num_Motor = num_Motor;
		this.cilindraje = cilindraje;
	}

	public void turbo () {
		System.out.printf("A todo gas, dijo Vin Gasolina Corriente\n");
		return;
	}
}
