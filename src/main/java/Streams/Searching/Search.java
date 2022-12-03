package Streams.Searching;

import Streams.CreateStream.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Search {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person(30,"pervez",50.5),
                new Person(2,"faiza",12.4),
                new Person(30,"sweety",60.7))
        );

        /******The Stream interface provides several methods for searching for
         *  elements in streams: allMatch, anyMatch, noneMatch
         *  All these are terminal opearation
         *  Takes predicate ***********/

        Boolean s =  list.stream().map(i->i.getName()).
                allMatch(i->i.startsWith("s"));

        Boolean s1 =  list.stream().map(i->i.getName()).
                anyMatch(i->i.startsWith("s"));

        System.out.println(s + " " + s1);


        /****  findFirst, and findAny ******
         * Terminal opeartions
         * Return optional , Does not take anything
         * Recommeded to use with ifPresent()
         * need to use filter first to narrow down the search***/

         Optional<String> name =
                 list.stream()
                         .map(i->i.getName())
                                 .filter(i->i.startsWith("s"))
                                    .findAny();

        System.out.println("NAME ::::: "+ name);
    }
}
