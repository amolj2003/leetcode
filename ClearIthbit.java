import java.util.Scanner;

class Main {
    public static void ClearIthbit(int S,int i) {
      
       int P= (S & ~(1<<i)); 
       System.out.println(P); 
     
}


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter the Element");
        int S=Input.nextInt();
        
        System.out.println(" Enter the I th position");
        int i=Input.nextInt();
        ClearIthbit(S,i);
    }
}
