package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeated {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,10,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        System.out.println(myList.stream().filter(n->!set.add(n)).findFirst().get());
        System.out.println(myList.stream().count());
    }
}
