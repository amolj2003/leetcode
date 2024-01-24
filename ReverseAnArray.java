import java.util.Scanner;

class main{
  public static void Reversearray(int Num1 [])
  {
   int i=0;
   int s=Num1.length-1;
   while(i<Num1.length/2){
    int temp=Num1[i];
    Num1[i]=Num1[s];
    Num1[s]=temp;
    i++;
    s--; 
  } 
   for(int j=0;j<Num1.length;j++){
    System.out.print(Num1[j]);
   }
   
  }
  
  
    public static void main(String[] args){
        
      int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      Reversearray(num1);
    }
}
