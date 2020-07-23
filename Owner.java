package javaapplication3;

public class Owner {

    private String name;
    private String icNumber;

    public Owner(String name, String icNumber) {
        this.name = name;
        this.icNumber = icNumber;
    }

    public String toString() {
        return String.format("%-15s %-15s", name, icNumber);
    }
}
