import java.util.Scanner;

class Main {
    public static void CheckPowerOfTwo(int S) {
      if((S & (S-1)) == 0){ System.out.print("True");}else{
        System.out.println("False");
      } 
     
}


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter the Element");
        int S=Input.nextInt();
        
       
        CheckPowerOfTwo(S);
    }
}
