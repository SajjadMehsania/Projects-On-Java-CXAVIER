import java.util.*;
public class temperatureconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;
        try{
         System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Enter your choice (1 or 2): ");
            int choice=sc.nextInt();
           
            System.out.println("Enter Temperature");
            double temp=sc.nextDouble();

            if (choice == 1) {
                result = (temp * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + result);
            } else if (choice == 2) {
                result = (temp - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + result);
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        catch(Exception e){
            System.out.println("Enter valid numbers only");
        }

    }
}
