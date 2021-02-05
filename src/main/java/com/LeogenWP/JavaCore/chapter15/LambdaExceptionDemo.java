package com.LeogenWP.JavaCore.chapter15;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0,2.0,3.0,4.0};

        DoubleNumerivArrayFunc average = (n) -> {
            double sum =0;
            if (n.length == 0){
                throw new EmptyArrayException();
            }
            for (int i =0;i <n.length;i++){
                sum +=n[i];
            }
            return sum/n.length;
        };

        System.out.println("Average is: " + average.func(values));
        System.out.println("Average is: " + average.func(new double[0]));

    }
}

class EmptyArrayException extends Exception {
    EmptyArrayException(){
        super("Array is Empty");
    }
}
interface DoubleNumerivArrayFunc {
    double func (double[] n) throws EmptyArrayException;
}

