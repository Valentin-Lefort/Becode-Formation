import java.util.ArrayList;
import java.util.List;

public class HelloGenerics{
  public static void main (String[] args){
    Car car = new Car(5);
    Trucks truck = new Trucks(12);
    
    List<Object> vehicle = new ArrayList<>();
    vehicle.add(car);
    vehicle.add(truck);
    
    for(Object vehicles : vehicle) {
      if(vehicles instanceof Car) {
        Car carObj = (Car) vehicle.get(0);
        System.out.println("Car wheels: " + carObj.getNumberOfWheels());
      }else if(vehicles instanceof Trucks){
        Trucks truckObj = (Trucks) vehicle.get(1);
        System.out.println("Truck wheels: " + truckObj.getNumberOfWheels());
      }
    }
  }
}

class Car {
  private int numberOfWheels;
  
  public Car (int numberOfWheels){
    this.numberOfWheels = numberOfWheels;
  }
  
  public int getNumberOfWheels(){
    return numberOfWheels;
  }
}

class Trucks {
  private int numberOfWheels;
  
  public Trucks (int numberOfWheels){
    this.numberOfWheels = numberOfWheels;
  }
  
  public int getNumberOfWheels(){
    return numberOfWheels;
  }
}