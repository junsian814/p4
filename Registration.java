package javaapplication3;

public class Registration {

    private static int count = 1001;
    private int regNo;
    private Owner owner;
    private Car car;

    public Registration(Owner owner, Car car) {
        this.owner = owner;
        this.car = car;
        regNo = count;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return String.format("%-6d %s %s", regNo, owner.toString(), car.toString());
    }
}
