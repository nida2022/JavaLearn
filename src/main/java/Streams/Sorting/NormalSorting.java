package Streams.Sorting;

import java.util.Arrays;

public class NormalSorting {
    public static void main(String[] args) {


        String s[] = {"sweety","sneha","pervez","Faiza"};

        Arrays.stream(s).sorted().forEach(System.out::println);
    }
}
