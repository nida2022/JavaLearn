package Streams.Sorting;

import Streams.CreateStream.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonSorting {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person(30, "pervez", 50.5),
                new Person(2, "faiza", 12.4),
                new Person(30, "sweety", 60.7))
        );

        /*****
         * sortbyname
         * Make you own comparator
         *****/

        Comparator<Person> sortByname = Comparator.comparing(Person::getName);
        Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);

        list.stream().sorted(sortByAge.thenComparing(sortByname)).forEach(System.out::println);

        list.stream().sorted(sortByAge.reversed()).forEach(System.out::println);
    }

    }
