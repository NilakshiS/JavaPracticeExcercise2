package com.stackroute.pe2;

public class PowerOfFour {
    public Boolean checkIfPower (int a){
        if (a == 0){
            return false;
        }
        if (a == 1){
            return true;
        }
        if (a < 0)
            return false;
        int remainder,quotient,num;
        num = a;
        do {
            remainder = num%4;
            if (remainder != 0){
                return false;
            }
            quotient = num/4;
            num = quotient;
        }while (num != 1);
        return true;
    }
}
