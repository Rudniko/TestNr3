package pl.kurs.zad5;

import pl.kurs.zad5.interfaces.EmployedPerson;
import pl.kurs.zad5.interfaces.StudyingPerson;

public class StudentEmployee extends Person implements StudyingPerson, EmployedPerson {
    private double scholarship;
    private double salary;

    public StudentEmployee(String firstName, String lastName, String pesel, double scholarship, double salary) {
        super(firstName, lastName, pesel);
        this.scholarship = scholarship;
        this.salary = salary;
    }
    @Override
    public double getIncome() {
        return scholarship + salary;
    }


    @Override
    public String toString() {
        return super.toString() +
                " scholarship = " + scholarship +
                ", salary = " + salary;
    }
}
