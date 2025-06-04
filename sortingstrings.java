import java.util.Scanner;
public class sortingstrings {
    public static void main(String args[]){
    System.out.println("Enter the number of elements you want in array");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String str[]=new String[n];
    System.out.println("Enter "+n+" elements");
    
    for(int i=0;i<n;i++){
    str[i]=sc.nextLine();
    }

   

    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(str[j].compareTo(str[j+1])>0){
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        }
    }
     for(int i=0;i<n;i++){
        System.out.println(str[i]);
    }
    }
}
