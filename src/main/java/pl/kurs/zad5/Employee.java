package pl.kurs.zad5;

import pl.kurs.zad5.interfaces.EmployedPerson;

public class Employee extends Person implements EmployedPerson {
    private double salary;

    public Employee(String firstName, String lastName, String pesel, double salary) {
        super(firstName, lastName, pesel);
        this.salary = salary;
    }


    @Override
    public double getIncome() {
        return salary;
    }


    @Override
    public String toString() {
        return super.toString() +
                " salary = " + salary;
    }
}
