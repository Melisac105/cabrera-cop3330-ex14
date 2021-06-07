package util;

public class Output {

    static public void printOutput(String state, double subtotal, double tax, double total){
        if(state.equals("WI")) {
            System.out.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", subtotal, tax, total);
        } else {
            System.out.format("The total is $%.2f.", subtotal);
    }   }
}
