package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input =  new Scanner(System.in);

    static public double getAmount() {
        System.out.print("What is the order amount? ");
        return input.nextDouble();
    }

    static public String getState() {
        System.out.print("What is the state? ");
        return input.next();
    }
}
