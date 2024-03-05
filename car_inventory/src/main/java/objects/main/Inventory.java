
package objects.main;

import java.util.ArrayList;
import java.lang.NumberFormatException;

public class Inventory {
  ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

  public Inventory () {
  }

  public int add_Car (String[] car_Data_List) {
    boolean isPublic = false;

    try {
      // Con solo intentarlo sabemos si sí es o no es un carro privado o público
      Float.parseFloat(car_Data_List[car_Data_List.length - 1]);
    } catch (NumberFormatException parseError) {
      isPublic = true;
    } catch (Exception err) {
      System.err.println(err);
      return 1;
    }

    try {
      Vehicle car_Added;

      if (!isPublic) {
        car_Added = new DistricVehicle(
          car_Data_List[1],
          Integer.parseInt(car_Data_List[2]),
          Integer.parseInt(car_Data_List[3]),
          Float.parseFloat(car_Data_List[4])
        );
      } else {
        car_Added = new IndividualVehicle(
          car_Data_List[1],
          Integer.parseInt(car_Data_List[2]),
          Integer.parseInt(car_Data_List[3]),
          car_Data_List[4]
        );
      }

      this.cars.add(car_Added);
      
    } catch (NumberFormatException parseError) {
      System.err.println(parseError);
      return 1;
    } catch (Exception err) {
      System.err.println(err);
      return 1;
    }

    return 0;
  }

  public ArrayList<Vehicle> get_All_Cars () {
    if (cars.size() <= 0) {
      return null;
    }

    return cars;
  }
}
