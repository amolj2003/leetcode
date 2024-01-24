import java.util.Scanner;

class main{
  public static void Reversearray(int Num1 [])
  {
    int MaxSum = 0;
    for(int i=0;i<Num1.length;i++){
      for(int j=i;j<Num1.length+1;j++){
        int sum=0; 
        for(int k=i;k<j;k++){
          sum=sum+Num1[k];
         }
         if(MaxSum<sum){
          MaxSum = sum;
         }
      }
        
    }
    System.out.println(MaxSum);
  }
  
  
    public static void main(String[] args){
        
      int[] num1 = {1,-2,6,-1,3};
      Reversearray(num1);
    }
}
