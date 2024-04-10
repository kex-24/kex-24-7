public class Car {
    private String model;
    private int maxSpeed;
    private String color;
    private boolean isConvertible;
    private int fuel;

    public Car(String model, int maxSpeed, String color, boolean isConvertible) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.isConvertible = isConvertible;
        this.fuel = 100;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setIsConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public boolean isConvertible() {
        return this.isConvertible;
    }

    public void refuel() {
        this.fuel = 100;
    }

    public void printInfor() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Max speed: " + this.getMaxSpeed());
        System.out.println("Color: " + this.getColor());
        System.out.println("This car is " + (this.isConvertible() ? "" : "not ") + "convertible");
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 180, "red", false);
        Car car2 = new Car("Volvo", 90, "blue", true);
        Car car3 = new Car("Dacia", 15, "black", false);

        car1.printInfor();
        car2.printInfor();
        car3.printInfor();
    }
}
