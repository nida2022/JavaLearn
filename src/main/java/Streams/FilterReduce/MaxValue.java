package Streams;

import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(List.of(15,3,1,6,7,98,16,5,4,32,0));
        int ans  = s.stream().mapToInt(i-> i).max().getAsInt();
        System.out.println(ans);
    }
}
