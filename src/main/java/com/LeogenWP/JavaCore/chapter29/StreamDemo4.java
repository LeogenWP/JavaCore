package com.LeogenWP.JavaCore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>();
        myList.add(16.0);
        myList.add(4.0);
        myList.add(4.0);

        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0,(a,b)->a*b);
        System.out.println("Произведение квадртаных корней равно: " + productOfSqrRoots);

    }
}
