package edu.umb.cs680.hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    private String[] carToStringArray(Car car) {
        String[] carInfo = {car.getMake(), car.getModel(), String.valueOf(car.getYear())};
        return carInfo;
    }
    @Test
    public void verifyCarEqualityWithMakeModelYear() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Toyota", "RAV4", 20000, 2018, 15000);
        assertArrayEquals(expected, carToStringArray(actual));
    }
    @Test
    public void secondVerifyCarEqualityWithMakeModelYear() {
        String[] expected = {"Audi", "SPORTS", "2015"};
        Car actual = new Car("Audi", "SPORTS", 43000, 2015, 20000);
        assertArrayEquals(expected, carToStringArray(actual));
    }
}