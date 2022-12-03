package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterEven {

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(List.of(5,3,1,6,7,98,6,5,4,32,0));

        s.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
