package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNoStartwith1 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(List.of(15,3,1,6,7,98,16,5,4,32,0));


        s.stream().map(n->n+"").filter(n->n.startsWith("1")).forEach(System.out::println);
    }
}
