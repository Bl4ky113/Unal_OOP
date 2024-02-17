
package objects.simple;

public class Simple {

    public static void main(String[] args) {
        System.out.println("Hello world!");

		Vehicle carro = new Vehicle("MNF046", "Cheverolet", "idk", "Gris");

		System.out.printf("%s\t%s\n", carro.placa, carro.color);

		Engine motor = new Engine("123456", 128);

		System.out.printf("%s\t%d\n", motor.numMotor, motor.cilindraje);
    }
}
