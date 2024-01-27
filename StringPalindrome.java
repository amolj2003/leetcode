import java.util.Scanner;

class Main {
    public static void StringPalindrome(String Str) {
       int i=0;
       int j=Str.length()-1;
       int Found=0;
       while(i!=j){
        if(Str.charAt(i)==Str.charAt(j)){
          i++;
          j--;
        }
        else{
          Found=1;
          break;
        }
       }
       if(Found==1){
        System.out.print("This is not a palindrome");
       }
       else{
        System.out.print("This is a palindrome ");
       }

      }


    public static void main(String[] args) {
        String Str = "madam";
        StringPalindrome(Str);
    }
}
