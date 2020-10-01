//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/28/2020
//Assignment 7


//HexCalc will be used for Hex calculations; implements ICalcOps and extends Calculator.
public class HexCalc extends Calculator implements ICalcOps{

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
}