
package objects.main;

import java.util.ArrayList;

public class Inventory {
  ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

  public Inventory () {
  }

  public int read_Next_Car () {
    return 0;
  }

  public ArrayList<Vehicle> get_All_Cars () {
    if (cars.size() <= 0) {
      return null;
    }

    return cars;
  }
}
