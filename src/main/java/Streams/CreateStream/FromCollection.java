package Streams.CreateStream;


import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromCollection {


/* dont use Stream.of() method to create stream from list or collection ,
 when u only want to create stream from scratch use Stream.of();
 */


    public static void main(String[] args) {

        /*From List*/
        List<Person> list = new ArrayList<> (List.of(
                new Person(30,"pervez",60.56),
                new Person(2,"faiza",11.0),
                new Person(30,"sweety",64.0))
        );
        Stream<Person> p  = list.stream();
        p.map(i->i.getName()).forEach(System.out::println);
        System.out.println();
        list.stream().map(i->i.getAge()).forEach(System.out::println);


        System.out.println();
        /*dont use*/
        /*Stream<List<Person>> p_arr  = Stream.of(list);
        p_arr.forEach(System.out::println);*/

        /*From map .. first need to conver it into set cz map is not part of collectio

         */
        Map<Integer,Person> hmap = new HashMap<>();
        hmap.put(1,new Person(31,"pervez",50.0));
        hmap.put(2,new Person(2,"faiza",9.0));
        hmap.put(3,new Person(30,"sweety",65.0));
        Stream<Map.Entry<Integer, Person>> pmap = hmap.entrySet().stream();
        System.out.println(
                "Map"
        );

        hmap.entrySet().stream().map(i->i.getValue().getName())
                .forEach(System.out::println);




        /*From Arrays */

        int [] arr = {1,6,4,32};
        System.out.println(Arrays.stream(arr));


        /*Create stream from Stream of method */

        Stream<Integer> st  = Stream.of(1,2,3,4,5);
        st.forEach(System.out::print);

        Integer [] ar = {1,6,4,32};
        Stream<Integer> st_ar  = Stream.of(ar);
        st_ar.forEach(System.out::print);

        //copile error we need object integer
       /* in [] ar = {1,6,4,32};
        Stream<Integer> st_ar  = Stream.of(ar);
        st.forEach(System.out::print);*/
    }


}
