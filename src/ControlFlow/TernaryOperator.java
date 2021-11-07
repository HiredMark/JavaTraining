package ControlFlow;

public class TernaryOperator {
    public static void main(String[] args){
        int income = 120_000;
        String className = income > 100_00 ? "First" : "Economy"; // ?  is the ternary operator. Allows to execute booleans in line. True : False
        System.out.println(className);
    }
}
