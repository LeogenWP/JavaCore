package com.LeogenWP.JavaCore.chapter20;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        if(noVal.isPresent()){
            System.out.println("Не подлежит выводу");
        } else{
            System.out.println("Объект noVal не содержит значения");
        }
        if(hasVal.isPresent()){
            System.out.println("Object hasVal contains :" + hasVal.get());
        }
        String defStr = noVal.orElse("Default string");
        System.out.println(defStr);
    }
}
