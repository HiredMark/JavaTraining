package ControlFlow;

public class LogicalOperators {
    public  static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature<30; // && is and operator in Java, code is evaluated sequantially
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false; // ! is the not operator in Java
        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord ; // || is or operator in Java, code is evaluated sequantially
        System.out.println(isEligible);


    }
}