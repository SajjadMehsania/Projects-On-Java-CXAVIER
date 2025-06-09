public class stringpalindrome {
    public static void main(String ar[]){
        String original="madam";
        original=original.toLowerCase();

        System.out.println(original);
        char[] chars=original.toCharArray();
        String reverse="";
        for(int i=chars.length-1;i>=0;i--){
          reverse+=chars[i];
        }
        System.out.println(reverse);
        if(original.equals(reverse)){
                    System.out.println("Yes it is palindrome");

        }
        else{
             System.out.println("No it is not palindrome");
        }
    }
}
