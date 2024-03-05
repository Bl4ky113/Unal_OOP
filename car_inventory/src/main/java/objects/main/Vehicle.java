
package objects.main;

public abstract class Vehicle {
  protected String plate = "";
  protected int maxSpeed = 0;
  protected int passengersNum = 0;

  public Vehicle (String plate, int maxSpeed, int passengersNum) {
    this.plate = plate;
    this.maxSpeed = maxSpeed;
    this.passengersNum = passengersNum;
  }

  abstract public String toString();
}
