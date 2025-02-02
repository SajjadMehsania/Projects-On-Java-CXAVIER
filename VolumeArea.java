import java.util.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class VolumeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Choose an option:\n1. Calculate Volume of Sphere\n2. Calculate Area of Circle");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of Sphere to calculate its volume");
                    double radius = sc.nextDouble();
                    if (radius <= 0) {
                        throw new InvalidInputException("Entered radius must be greater than zero");
                    }
                    double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
                    System.out.println("Volume of the Sphere: " + volume);
                    break;

                case 2:
                    System.out.println("Enter the radius of Circle to calculate its Area");
                    double radiusCircle = sc.nextDouble();
                    if (radiusCircle <= 0) {
                        throw new InvalidInputException("Entered radius must be greater than zero");
                    }
                    double area = Math.PI * Math.pow(radiusCircle, 2);
                    System.out.println("Area of the Circle: " + area);
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
            }
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
