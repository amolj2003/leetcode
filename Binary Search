import java.util.Scanner;

class main{
  public static int LinearSearch(int Num1 [],int Key)
  {
    int lowest = 0;
    int highest= Num1.length-1;
    while(lowest<=highest){
    int mid = (lowest + highest)/2;
    if(Key == Num1[mid]){
      return mid; 
    }
    else if (Num1[mid]>Key){
      highest = mid-1;
    }
    else if(Num1[mid]<Key){
      lowest = mid+1;
    }
    }
     return -1;
  }
  
  
    public static void main(String[] args){
        
      int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int Index=LinearSearch(num1,6);
      System.out.println(" The Largest No in the array is  : " +Index);
    }
}
