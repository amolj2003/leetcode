import java.util.Scanner;

class main{
  public static void  Average (int Num1, int Num2, int Num3){
  int average=(Num1+Num2+Num3)/3;
  System.out.println(" " +average);
  }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number You Want to take average of :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3= input.nextInt();
        Average(num1,num2,num3);
    }
}
