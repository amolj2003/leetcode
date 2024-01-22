import java.util.Scanner;

class main{
  public static void ZeroAndOnetraingle(int Num1){
   for(int i=0;i<Num1/2;i++){
    for(int j=0;j<Num1;j++){
      if(j<i+1 || j>= Num1-i-1){
        System.out.print(" * ");
       } 
       else
       {
        System.out.print(" 0 ");
       }
    }
  System.err.println(" ");
 }
 for(int i=0;i<Num1/2;i++){
  for(int j=0;j<Num1;j++){
    if(j<(Num1/2)-i || j>= (Num1/2)+i){
      System.out.print(" * ");
     } 
     else
     {
      System.out.print(" 0 ");
     }
  }
System.err.println(" ");
}
    
}
  
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height Of the pyramind:");
        int num1 = input.nextInt();
        ZeroAndOnetraingle(num1);
    }
}
