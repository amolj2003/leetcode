import java.util.Scanner;

class main{
  public static void HollowRhombus(int Num1){
  
    for(int i=0;i<Num1;i++){
      int t=Num1;
      for(int j=0;j<=2*Num1;j++){
        if(j>Num1-i && t > 0 ){
          if(i==0||i==Num1-1 || t==1||t==Num1){
            System.out.print("*");
            t--;
          }
          else{
            System.out.print(" ");
             t--;
          }
          
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
}
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height Of the pyramind:");
        int num1 = input.nextInt();
        HollowRhombus(num1);
    }
}
