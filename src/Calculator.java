//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/28/2020
//Assignment 7

//Calculator implements ICalcOps and has Overrides for the methods from the interface
public class Calculator implements ICalcOps{

    @Override
    public int add(int a, int b){
        int sum = a + b;

        return sum;
    }

    @Override
    public int sub(int a, int b){
        int diff = a - b;

        return diff;
    }

    @Override
    public int mul(int a, int b){
        int prod = a * b;

        return prod;
    }

    @Override
    public int div(int a, int b){
        int quotient = a/b;

        return quotient;
    }

    public int hexToDec(String hexValue){

        int value = Integer.parseInt(hexValue, 16);

        return value;

    }
}