import java.util.Scanner;

class main{
  public static Boolean  isEven (int Num1){
  if(Num1%2==0){
    return true;
  }
  else{
    return false;
  }
  }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The Number To Test is Even ?:");
        int num1 = input.nextInt();
         System.out.println(isEven(num1)); 
    }
}
