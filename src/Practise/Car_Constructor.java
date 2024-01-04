public class Car_Constructor {
    String brand;
    int speed;

    // Default Constructor
    public Car_Constructor() {
        // Sets default values for brand and speed
        this.brand = "Unknown";
        this.speed = 0;
    }

    // Parameterized Constructor
    public Car_Constructor(String brand, int speed) {
        // Sets the brand and speed to the provided values
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        speed += 10; // Increases speed by 10
    }

    public void brake() {
        speed -= 10; // Decreases speed by 10
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Car_Constructor defaultCar = new Car_Constructor(); // Creates a car with default settings
        Car_Constructor tesla = new Car_Constructor("Tesla", 60); // Creates a Tesla car with speed 60
        Car_Constructor ford = new Car_Constructor("Ford", 40); // Creates a Ford car with speed 40

        // Demonstration of using methods
        tesla.accelerate();
        ford.brake();

        // Output the state of the cars
        System.out.println("Default Car: Brand=" + defaultCar.brand + ", Speed=" + defaultCar.speed);
        System.out.println("Tesla: Brand=" + tesla.brand + ", Speed=" + tesla.speed);
        System.out.println("Ford: Brand=" + ford.brand + ", Speed=" + ford.speed);
    }
}
