import java.util.Scanner;

class Main {
    public static void  SpeedExponential(int S , int n) {
        int value = 1;
        while (n > 0) {
            int Mul = (n & 1);
            if ( Mul != 0) {
             value = value * S;
            }
            S = S*S;
            n=n>>1; 
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Element");
        int Number = Input.nextInt();
        System.out.println("Enter the Power ");
        int Power  = Input.nextInt();
        SpeedExponential(Number,Power);
    }
}
