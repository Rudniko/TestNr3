package pl.kurs.zad5;

public abstract class Person  {
    private String firstName;
    private String lastName;
    private final String pesel;


    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public abstract double getIncome();

    @Override
    public String toString() {
        return "Person " +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", pesel = " + pesel;
    }
}
