package pl.kurs.zad5;






import pl.kurs.zad5.interfaces.EmployedPerson;
import pl.kurs.zad5.interfaces.StudyingPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {


        Student person1 = new Student("Patryk", "Bandurski", "02020304304", 2000);
        Employee person2 = new Employee("Maciek", "Rogalski", "12345678901", 5000);
        StudentEmployee person3 = new StudentEmployee("Rafał", "Michalik", "64530034232", 1000, 5000);

        List<Person> people = List.of(person1, person2, person3);

        double avgIncome = getAvgIncome(people);
        System.out.println(avgIncome);

        List<Person> students = findStudents(people);
        students.forEach(System.out::println);



    }

    //Przykładowe metody
    static double getAvgIncome(List<Person> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .mapToDouble(Person::getIncome)
                .average()
                .orElseThrow();
    }

    static List<Person> findStudents(List<Person> list) {
       return list.stream()
               .filter(Objects::nonNull)
               .filter(x -> x instanceof StudyingPerson)
               .collect(Collectors.toList());

    }


}
