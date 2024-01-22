import java.util.Scanner;

class main{
  public static void Diamond(int Num1)
  {

    for(int i=0;i<Num1/2;i++ ){
      for(int j=1;j<=Num1-1;j++){
        int Mid=(Num1-1)/2;
        if(j<Mid-i+1 || j> Mid+i+1){
          System.out.print("   ");
        }
        else{
         System.out.print(" * ");
        } 
      }
      System.out.println();
    } 


    for(int i=0;i<Num1/2;i++ ){
      for(int j=1;j<=Num1-1;j++){
        int Mid=(Num1-1)/2;
        if(j<i+1 || j>Num1-1-i){
          System.out.print("   ");
        }
        else{
          System.out.print(" * ");
        }
      }
      System.out.println();
    } 
  }
  
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height Of the pyramind:");
        int num1 = input.nextInt();
        Diamond(num1);
    }
}
