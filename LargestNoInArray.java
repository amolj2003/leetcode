import java.util.Scanner;

class main{
  public static int LinearSearch(int Num1 [])
  {
    int Largest=Num1[0];
    for(int i=0;i<Num1.length -1 ;i++){
     if(Largest<Num1[i+1]){
      Largest = Num1[i+1];
     }
  }
  return Largest;
}
  
  
    public static void main(String[] args){
        
      int[] num1 = {1, 2, 3, 4, 5, 16, 7, 8, 9};
      int Index=LinearSearch(num1);
      System.out.println(" The Largest No in the array is  : " +Index);
    }
}
