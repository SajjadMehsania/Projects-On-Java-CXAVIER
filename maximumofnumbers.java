import java.util.*;
public class maximumofnumbers {
    public static void main(String[] args) {
        System.out.println("Enter thr the size of array ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
       
        
        
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
                    System.out.println("Maximum element is==> "+arr[N-1]);

    }
}
