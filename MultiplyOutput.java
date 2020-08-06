
import java.util.Scanner;
public class MultiplyOutput {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Type your first number =  ");
            double num1 = Integer.parseInt(input.nextLine());
            System.out.print("Type your second number =  ");
            double num2 = Integer.parseInt(input.nextLine());
            double product = num1 * num2;
            System.out.println("The product of the numbers is " + product);
        }
    }

