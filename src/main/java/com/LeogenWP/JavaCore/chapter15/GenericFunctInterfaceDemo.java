package com.LeogenWP.JavaCore.chapter15;

public class GenericFunctInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for(i = str.length()-1; i>=0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(" Reverse hello - " + reverse.func("hello"));

        SomeFunc<Integer> factorial = (n) -> {
          int result = 1;
          for (int i=1;i<=n;i++){
              result = i*result;
          }
          return result;
        };
        System.out.println("3! is " + factorial.func(3));
    }
}

interface SomeFunc<T> {
    T func(T t);
}
