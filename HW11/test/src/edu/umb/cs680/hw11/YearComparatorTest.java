package edu.umb.cs680.hw11;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class YearComparatorTest {
    LinkedList<Car> list = new LinkedList<>();
    @Test
    void YearCmpTest() {
        Car car1 = new Car("Toyota", "RAV4", 20000, 2018, 15000);
        Car car2 = new Car("Audi", "SPORTS", 43000, 2015, 20000);
        Car car3 = new Car("Mercedes", "BUSINESS", 35000, 2016, 50000);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Collections.sort(list,new YearComparator());
        assertEquals(car2, list.get(0));
        assertEquals(car3, list.get(1));
        assertEquals(car1, list.get(2));
    }
}