import java.io.*;
public class primenumber {
public static void main(String[] args) {
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int flag=1;
    try{
       
        System.out.println("Enter number to check prime or not");
        int num=Integer.parseInt(br.readLine());

        for(int i=2;i<(num / 2)+1;i++){

            if(num%i==0){
                flag=0;
                break;
            } 
        }
       
        if(flag==1){
 System.out.println("Prime "+num);
        }
        else {System.out.println("Not Prime " + num);}

    }catch(Exception e){
        System.out.println(e);
    }
}    
}
