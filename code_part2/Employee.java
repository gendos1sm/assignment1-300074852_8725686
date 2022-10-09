import java.util.*;

public class Employee {

    private String name;
    private int hours;
    private double rate;
    public Address [] address;

    public Employee () {

    }

    public Employee (String name, int hours, double rate, Address[] address) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.address = address;
    }

    public String toString() {
        return "Employee: " + name + " (" + rate + ", " + hours + "); " + "Addresses: " + Arrays.toString(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public Address[] getAddress() {
        return address;
    }

}
