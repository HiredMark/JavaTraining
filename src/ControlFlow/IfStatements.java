package ControlFlow;

public class IfStatements {
    public static void main (String[] args){
        int temp = 32;
        if (temp> 30) {
            System.out.println("It is a hot day");
            System.out.println("Dring plenty of water!");
        } else if (temp > 20 && temp <=30){
            System.out.println("Beautiful Day");
        } else {
            System.out.println("Cold day!");
        }
    }

}
