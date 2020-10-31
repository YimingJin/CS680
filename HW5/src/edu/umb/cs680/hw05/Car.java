package edu.umb.cs680.hw05;

public class Car {
    private String make, model;
    private int mileage, year;
    private float price;
    public Car(String make, String model, int mileage, int year, float price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getMileage() {
        return mileage;
    }
    public int getYear() {
        return year;
    }
    public float getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Car car = new Car("Audi", "SPORTS",43000, 2015, 20000);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Mileage: " + car.getMileage());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
    }
}
