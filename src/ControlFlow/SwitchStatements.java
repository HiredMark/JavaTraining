package ControlFlow;

public class SwitchStatements {
    public static void main (String[] args){
        String role = "admin";

        switch (role){ //can take anythong other than long.
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");

        }

//        if (role == "admin")
//            System.out.println("You are an admin");
//        else if (role == "moderator")
//            System.out.println("You are a moderator");
//        else
//            System.out.println("You are a guest");
    }
}
