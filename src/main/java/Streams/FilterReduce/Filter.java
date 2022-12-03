package Streams.FilterReduce;

import Streams.CreateStream.Person;

import java.util.*;
import java.util.function.Predicate;

public class Filter {

    /*Filter uses predicate , takes a input return boolean */

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person(30,"pervez",50.5),
                new Person(2,"faiza",12.4),
                new Person(30,"sweety",60.7))
        );

        list.stream().filter((i->i.getName().equals("pervez")))
                .map(i->i.getName())
                .forEach(System.out::println);

        list.stream().filter(Predicate.not(i->i.getName().equals("pervez")))
                .map(i->i.getName())
                .forEach(System.out::println);

        list.stream().mapToDouble(i->i.getWeight()).forEach(System.out::println);

    /***********return type of double is optional**********/
       OptionalDouble s =  list.stream().mapToDouble(i->i.getWeight()).average();
        System.out.println(s.getAsDouble());


        /**************Make ur own reduce **********/

         OptionalInt sum  = list.stream().mapToInt(i->i.getAge())
                .reduce((i,j)->i+j);

        System.out.println("SUM :::: " +sum.getAsInt());

    }



}
