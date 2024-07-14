package pl.kurs.zad4;




import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> names = List.of("Andrzej", "Michał", "Ola", "Agnieszka", "Seba");
        MinMax<String> minAndMaxNames = MinMaxService.getMinAndMax(names);
        String minName = minAndMaxNames.getMin();
        String maxName = minAndMaxNames.getMax();
        System.out.println(minName);
        System.out.println(maxName);


        List<Integer> numbers = List.of(5, 2, 6, 1, 3, 55, 4, 4, 0);
        MinMax<Integer> minMaxNumbers = MinMaxService.getMinAndMax(numbers);
        Integer minNumber = minMaxNumbers.getMin();
        Integer maxNumber = minMaxNumbers.getMax();
        System.out.println(maxNumber);
        System.out.println(minNumber);


        List<Person> people = List.of(
                new Person("Andrzej", "Buc", 45),
                new Person("Aleksandra", "Wierzba", 18),
                new Person("Michał", "Poniatowski", 25),
                new Person("Patryk", "Rudnicki", 35),
                new Person("Krzysztof", "Karpaty", 58),
                new Person("Michał", "Haza", 25)
        );

        MinMax<Person> minAndMaxPerson = MinMaxService.getMinAndMax(people);
        Person minPerson = minAndMaxPerson.getMin();
        Person maxPerson = minAndMaxPerson.getMax();
        System.out.println(minPerson);
        System.out.println(maxPerson);


    }
}
