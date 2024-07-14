package pl.kurs.zad5;


import pl.kurs.zad5.interfaces.StudyingPerson;

public class Student extends Person implements StudyingPerson {

    private double scholarship;

    public Student(String firstName, String lastName, String pesel, double scholarship) {
        super(firstName, lastName, pesel);
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }


    @Override
    public String toString() {
        return super.toString() +
                " scholarship = " + scholarship;

    }
}
