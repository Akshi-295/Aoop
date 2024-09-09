package abcd; 
class vehicles {
  String brand;
  int year;

  public vehicles(String brand, int year) {
     this.brand = brand;
     this.year = year;
  }

  public String getBrand() {
     return brand;
  }

  public int getYear() {
     return year;
  }

  public void startEngine() {
     System.out.println("The engine is started.");
  }

  public void stopEngine() {
     System.out.println("The engine is stopped.");
  }
}

class Car extends vehicles
{
  String model1;

  public Car(String brand, int year, String model1) {
     super(brand, year);
     this.model1 = model1;
  }

  public String getModel() {
     return model1;
  }

  public void honk() {
     System.out.println("The car is honking.");
  }
  }



public class Vehicle {
  public static void main(String[] args) {
       vehicles  ve = new vehicles("Toyota", 2020);
       System.out.println("Vehicle Brand: " + ve.getBrand());
       System.out.println("Vehicle Year: " + ve.getYear());
       ve.startEngine();   
       ve.stopEngine();
       
       Car car = new Car("Honda", 2022, "Civic");
       System.out.println("Car Brand: " + car.getBrand());
       System.out.println("Car Year: " + car.getYear());
       System.out.println("Car Model: " + car.getModel());
       car.startEngine();
       car.honk();
       car.stopEngine(); }
}
