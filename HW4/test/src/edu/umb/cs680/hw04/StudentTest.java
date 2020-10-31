package edu.umb.cs680.hw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void createInStateStudentTest() {
        String expectedName = "John";
        String expectedUsAddr = "Boston";
        float expectedTuition = (float)1000.0;
        Student st = Student.createInState("John", "Boston");
        assertEquals(expectedName, st.getName());
        assertEquals(expectedUsAddr, st.getUsAddr());
        assertEquals(expectedTuition, st.getTuition());
    }
    @Test
    public void createOutStateStudentTest() {
        String expectedName = "Linda";
        String expectedUsAddr = "Quincy";
        int expectedYrsInState = 15;
        float expectedTuition = (float)3000.0;
        Student st = Student.createOutState("Linda", "Quincy", 15);
        assertEquals(expectedName, st.getName());
        assertEquals(expectedUsAddr, st.getUsAddr());
        assertEquals(expectedYrsInState, st.getYrsInState());
        assertEquals(expectedTuition, st.getTuition());
    }
    @Test
    public void createIntlStateStudentTest() {
        String expectedName = "Jim";
        String expectedUsAddr = "Malden";
        int expectedI20num = 1234;
        String expectedForeignAddr = "Paris";
        float expectedTuition = (float)5000.0;
        Student st = Student.createIntlState("Jim", "Malden", 1234, "Paris");
        assertEquals(expectedName, st.getName());
        assertEquals(expectedUsAddr, st.getUsAddr());
        assertEquals(expectedI20num, st.getI20num());
        assertEquals(expectedForeignAddr, st.getForeignAddr());
        assertEquals(expectedTuition, st.getTuition());
    }

}