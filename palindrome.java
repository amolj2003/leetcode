import java.util.Scanner;

class main{
  public static Boolean palindrome (int Num1){
  int OriginalNum=Num1;
  int reverse = 0 ;
  int pow = 0;
  
  while(Num1>0){
    int rem =  Num1 % 10;
    reverse = reverse + ( rem * (int)(Math.pow(10,pow))); 
    pow ++;
    Num1=Num1/10;
  } 
  reverse=(int)(reverse);
   if(reverse==OriginalNum){
    return true;
   } 
   else{
    return false;
   }
  }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The Number To Test is Palidrome ?:");
        int num1 = input.nextInt();
        boolean s= palindrome(num1);
         System.out.println(s); 
    }
}
