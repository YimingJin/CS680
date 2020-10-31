package edu.umb.cs680.hw04;

public class Student {
    private float tuition;
    private String name;
    private int i20num;
    private String usAddr;
    private int yrsInState;
    private String foreignAddr;
    private StudentStatus status;
    private Student (String name, String usAddr, int yrsInState, int i20num, String foreignAddr, StudentStatus status) {
        this.name = name;
        this.usAddr = usAddr;
        this.yrsInState = yrsInState;
        this.i20num = i20num;
        this.foreignAddr = foreignAddr;
        this.status = status;
    }
    public float getTuition() {
        if (status.equals(StudentStatus.InState)) {
            return 1000;
        } else if (status.equals(StudentStatus.OutState)) {
            return 3000;
        } else {
            return 5000;
        }
    }
    public String getName() {
        return name;
    }
    public StudentStatus getStatus() {
        return status;
    }
    public int getI20num() {
        return i20num;
    }
    public String getUsAddr() {
        return usAddr;
    }
    public int getYrsInState() {
        return yrsInState;
    }
    public String getForeignAddr() {
        return foreignAddr;
    }
    public static Student createInState(String name, String usAddr) {
        return new Student(name, usAddr, 0, 0, null, StudentStatus.InState);
    }
    public static Student createOutState(String name, String usAddr, int yrsInState) {
        return new Student(name, usAddr, yrsInState, 0, null, StudentStatus.OutState);
    }
    public static Student createIntlState(String name, String usAddr, int i20num, String foreignAddr) {
        return new Student(name, usAddr, 0, i20num, foreignAddr, StudentStatus.Intl);
    }
    public static void main(String[] args) {
        Student InS = Student.createInState("Tom", "Boston");
        System.out.println("InState Student " + InS.getName()+ " Tuition Fee: " + InS.getTuition());
        Student OutS = Student.createOutState("Jim", "Morrissey", 2);
        System.out.println("OutState Student " + OutS.getName()+ " Tuition Fee: " + OutS.getTuition());
        Student IntlS = Student.createIntlState("Linda", "William", 1234, "Paris");
        System.out.println("IntlState Student " + IntlS.getName()+ " Tuition Fee: " + IntlS.getTuition());
    }
}
