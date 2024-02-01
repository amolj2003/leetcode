import java.util.Scanner;

class Main {
    public static void getIthbit(int S,int i) {
      
      if((S & (1<<i)) == 0){
         System.out.println(" The I th Bit is Zero.");
      }
      else{
        System.out.println(" The I th bit is One.");
      }
      
}


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter the Element");
        int S=Input.nextInt();
        
        System.out.println(" Enter the I th position");
        int i=Input.nextInt();
        getIthbit(S,i);
    }
}
