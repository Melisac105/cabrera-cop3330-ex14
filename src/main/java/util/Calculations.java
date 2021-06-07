package util;

public class Calculations {

    static public double calcTax(double amount) {
        return amount * (5.5/100);
    }

    static public double calTotalResidents(double subtotal, double tax) {
        return subtotal + tax;
    }
}
