import java.util.Scanner;

class main{
  public static void MaxSumArray(int Num1 [])
  {
    // creating a prefix Array 
    int Prefix [] = new int[Num1.length] ;
    Prefix[0]=Num1[0];
    for(int i=1;i<Num1.length;i++){
      Prefix[i]=Prefix[i-1]+Num1[i];
    }
  
   int end = Prefix[Num1.length-1];

   int max=0;
   for(int i=0;i<Num1.length-1;i++){
    if(end-Prefix[i] > max){
      max=end-Prefix[i];
    }
   }
System.out.println(max);
  }
  
  
    public static void main(String[] args){
        
      int[] num1 = {1,-2,6,-1,3};
      MaxSumArray(num1);
    }
}
