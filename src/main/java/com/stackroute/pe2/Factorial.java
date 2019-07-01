package com.stackroute.pe2;

import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        int i;
        Factorial f = new Factorial();
        Integer[] intarr = f.intFactorial();
        Long[] arr = f.longFactorial();

        for (i = 0;i<intarr.length;i++){
            System.out.println("The factorial of "+(i+1)+" is: "+intarr[i]);
        }
        System.out.println("The factorial of "+(i+1)+" is out of range\n\n");

        for (i = 0;i<arr.length;i++){
            System.out.println("The factorial of "+(i+1)+" is: "+arr[i]);
        }
        System.out.println("The factorial of "+(i+1)+" is out of range");


    }
    public Integer[] intFactorial(){
        ArrayList<Integer> factorials = new ArrayList<>();
        int result = 0;
        int number = 1;
        int fact = 1;
        boolean flag = true;

        do {
            result = fact;
            factorials.add(result);
            if (Integer.MAX_VALUE / fact < (number+1)) {
                flag = false;
            }
            number++;
            fact *= number;

        }while(flag);
        return factorials.toArray(new Integer[0]);
    }
    public Long[] longFactorial(){
        ArrayList<Long> factorials = new ArrayList<>();
        long result = 0;
        int number = 1;
        long fact = 1;
        boolean flag = true;

        do {
            result = fact;
            factorials.add(result);
            if (Long.MAX_VALUE / fact < (number+1)) {
                flag = false;
            }
            number++;
            fact *= number;

        }while(flag);
        System.out.println(factorials.toString());
        return factorials.toArray(new Long[0]);
    }
}
