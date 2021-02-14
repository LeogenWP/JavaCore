package com.LeogenWP.JavaCore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(2.2);
        myList.add(2.8);
        myList.add(3.2);

        System.out.println("Origin values from myList: ");
        myList.stream().forEach((a) -> System.out.print(a + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.println(" max closest value for elements from myList: ");
        cStrm.forEach((a) -> {
            System.out.print(a + " ");
        });
    }
}
