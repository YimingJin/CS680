package edu.umb.cs680.hw14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceComparatorTest {
    static LinkedList<Car> list = new LinkedList<Car>();
    static Car car1;
    static Car car2;
    static Car car3;
    @BeforeAll
    public static void init() {
        car1 = new Car("Toyota", "RAV4", 20000, 2018, 15000);
        car2 = new Car("Audi", "SPORTS", 43000, 2015, 20000);
        car3 = new Car("Mercedes", "BUSINESS", 35000, 2016, 50000);
        list.add(car1);
        list.add(car2);
        list.add(car3);
    }
    @Test
    public void priceSorting() {
        Collections.sort(list,(Car obj1, Car obj2) -> (int)obj2.getPrice() - (int)obj1.getPrice());
        assertEquals(car3, list.get(0));
        assertEquals(car2, list.get(1));
        assertEquals(car1, list.get(2));

    }
    @Test
    public void priceSortingWithComparatorComparing() {
        Comparator<Car> compare = Comparator.comparing(Car::getPrice);
        Collections.sort(list, compare);
        assertEquals(car1, list.get(0));
        assertEquals(car2, list.get(1));
        assertEquals(car3, list.get(2));

    }
}
