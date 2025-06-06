public class reversestring {
public static void main(String[] args) {
    String original="hello";
    char chars[]=original.toCharArray();
    String reverse="";
    for(int i=chars.length-1;i>=0;i--){
        reverse=reverse+chars[i];
    }
    System.out.println("Reversed String ==>" +reverse);
    System.out.println("Original String is ==> "+original);
}    
}
