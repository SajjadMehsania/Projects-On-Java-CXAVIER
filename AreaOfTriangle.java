import java.io.*;

import javax.sound.midi.SysexMessage;
public class AreaOfTriangle {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter the base length of the triangle");
            double base = Double.parseDouble(in.readLine()); // Read base as a double
             
             System.out.println("Enter the height of the triangle");
             double height = Double.parseDouble(in.readLine()); // Read height as a double

             double area = 0.5 * base * height;
             System.out.println("The area of the triangle is: " + area);
         }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
