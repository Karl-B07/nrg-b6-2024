class Vehicle {
    String Inventor;
    String Make;
    String Model;
    int Year;

    public Vehicle(String Make, String Model, int Year, String Inventor) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Inventor = Inventor;
    }


    class Car extends Vehicle {
        private int numberOfDoors;


        public Car(String Make, String Model, int Year, int numberOfDoors, String Inventor) {
            super(Make, Model, Year, Inventor);
            this.numberOfDoors = numberOfDoors;
        }
        public void displayDetails() {
            System.out.println("Car Details:");
            System.out.println("Inventor: " + Inventor);
            System.out.println("Make: " + Make);
            System.out.println("Model: " + Model);
            System.out.println("Year: " + Year);
            System.out.println("Number of Doors: " + numberOfDoors);
            System.out.println("");
        }
    }
}

public class Task12 {
    public static void main(String[] args) {
        Vehicle.Car Car1 = new Vehicle("Ford", "Model T", 1908, "Henry Ford").new Car("Ford", "Model T", 1908, 2, "Henry Ford");
        Vehicle.Car Car2 = new Vehicle("Mercedes-Benz", "300 SL Gullwing", 1954, "Rudolf Uhlenhaut").new Car("Mercedes-Benz", "300 SL Gullwing", 1954, 2, "Rudolf Uhlenhaut");
        Vehicle.Car Car3 = new Vehicle("Toyota", "Prius", 1997, "Takeshi Uchiyamada").new Car("Toyota", "Prius", 1997, 4, "Takeshi Uchiyamada");

        Car1.displayDetails();
        Car2.displayDetails();
        Car3.displayDetails();
    }
}