import java.util.Scanner;

class main{
  public static void NumberPyramid(int Num1)
  {
    for(int i=1;i<=Num1;i++){
     for(int j=1;j<=Num1-i;j++){
      System.out.print(" ");
     }
     for(int k=1;k<=i;k++){
      System.out.print(" " +i);
     }
     System.out.println();
    } 
  }
  
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height Of the pyramind:");
        int num1 = input.nextInt();
        NumberPyramid(num1);
    }
}
