
package objects.main;

public class DistricVehicle extends Vehicle {
  protected double capacityKg = 0.0;

  public DistricVehicle (String plate, int maxSpeed, int passengersNum, double capacityKg) {
    super(plate, maxSpeed, passengersNum); 
    
    this.capacityKg = capacityKg;
  }

  public String toString () {
    // Formats es la mejor cosa que le pudo haber pasado a los strings desde alloca
    return String.format(
      "\033[1m%s\033[0m |\t%d |\t%d |\t%.2f |\n",
      plate,
      maxSpeed,
      passengersNum,
      capacityKg
    );
  }
}
