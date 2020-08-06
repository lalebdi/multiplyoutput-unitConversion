

import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many inches we're talking about =  ");
        double inches = Integer.parseInt(input.nextLine());
        double meters = inches / 39.37;
        String metersDouble = String.format("%.2f", meters);
        System.out.println(inches + "  inchs is " + metersDouble);
    }
}
