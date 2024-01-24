import java.util.Scanner;

class main{
  public static void Reversearray(int Num1 [])
  {
    for(int i=0;i<Num1.length;i++){
      for(int j=i;j<Num1.length+1;j++){
         for(int k=i;k<j;k++){
          System.out.print(Num1[k]);
         }
         System.err.println();
      
        }
        System.out.println();
        System.out.println();
    }
  }
  
  
    public static void main(String[] args){
        
      int[] num1 = {2,4,6,8,10};
      Reversearray(num1);
    }
}
