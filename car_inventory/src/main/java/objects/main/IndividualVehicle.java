
package objects.main;

public class IndividualVehicle extends Vehicle {
  protected String color = "";

  public IndividualVehicle (String plate, int maxSpeed, int passengersNum, String color) {
    super(plate, maxSpeed, passengersNum); 

    this.color = color;
  }

  public String toString () {
    // Formats es la mejor cosa que le pudo haber pasado a los strings desde alloca
    return String.format(
      "\033[1;35mPrivado\033[0m |\t\033[1m%s\033[0m |\t%d |\t%d |\t%s |",
      plate,
      maxSpeed,
      passengersNum,
      color
    );
  }
}
