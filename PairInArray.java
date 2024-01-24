import java.util.Scanner;

class main{
  public static void Reversearray(int Num1 [])
  {
    for(int i=0;i<Num1.length-1;i++){
      for(int j=i+1;j<Num1.length;j++){
        System.out.print( "("+Num1[i]+ ","+ Num1[j]+ ")");
      }
      System.out.println();
    }
  }
  
  
    public static void main(String[] args){
        
      int[] num1 = {2,4,6,8,10};
      Reversearray(num1);
    }
}
