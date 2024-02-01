import java.util.Scanner;

class Main {
    public static void OddEven(int S) {
       
      if((S&1)==0){
         System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
      
}


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int S=Input.nextInt();
        OddEven(S);
    }
}
