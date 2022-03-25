package day13.Map;

public class Employee {
   private int roll;
    private int name;
    private int marks;

    public Employee(int roll, int name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Employee() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "roll=" + roll +
                ", name=" + name +
                ", marks=" + marks +
                '}';
    }
}
