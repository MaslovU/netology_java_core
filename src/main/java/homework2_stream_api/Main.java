package homework2_stream_api;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John", "Yury", "Ivan", "Irina");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown", "Maslov");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        int countYang = (int) persons.stream()
                .filter(person -> person.getAge() < 19)
                .count();
        List<String> toArmy = persons.stream()
                .filter(person -> person.getAge() > 17 && person.getAge() < 29)
                .filter(person -> person.getSex().equals(Sex.MAN))
                .map(String::valueOf)
                .collect(Collectors.toList());
        List<Person> workingPeople = persons.stream()
                .filter(person -> person.getEducation().equals(Education.HIGHER))
                .filter(person -> person.getAge() >= 18)
                .filter(person -> (person.getSex() == Sex.WOMAN && person.getAge() < 55)
                        || (person.getSex() == Sex.MAN && person.getAge() < 60))
                .sorted(comparing(Person::getFamily))
                .collect(Collectors.toList());
        System.out.println(workingPeople);
    }
}
