package com.LeogenWP.JavaCore.chapter29;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(16);
        myList.add(4);
        myList.add(4);

        double productOfSqrtRoots = myList.parallelStream().reduce(
                1.0,
                (a,b)->a*Math.sqrt(b),
                (a,b)->a*b
        );
        System.out.println("productOfSqrtRoots: " + productOfSqrtRoots);
    }
}
