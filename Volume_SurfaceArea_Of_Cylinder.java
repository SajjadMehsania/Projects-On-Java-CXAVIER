import java.util.*;

class InvalidDataException extends Exception{
    public InvalidDataException(String message){
        super(message);
    }
}
class Volume_SurfaceArea_Of_Cylinder{
    public static void main(String[] args) {
       try{
        System.out.println("Enter the height of th cylinder");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        
        System.out.println("Enter the radius of the cylinder");
        double radius = sc.nextDouble();
        if (radius==0||height==0){
            throw new InvalidDataException("Input should not be zero");
        }
        
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        
        System.out.println("Volume of the cylinder: " + volume);
        System.out.println("Surface area of the cylinder: " + surfaceArea);
        
       }
       catch(InvalidDataException e){
        System.out.println(e);
       }


    }
}