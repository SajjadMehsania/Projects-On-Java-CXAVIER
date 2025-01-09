import java.util.*;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("Enter the base number");
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();//X is base number

        System.out.println("Enter the total terms"); //ex if term is 4 that means 1+x+x^2+x^3+x^4;
        int n=sc.nextInt();//N is power
        double sum=0.0;
        double term=1.0;
        int i=0;
        while(i<=n){
            sum=sum+term;
            term=term*x;
            i++; 
        }
        System.out.println("The sum of the series is " + sum);
    }
}
