import java.util.Scanner;

class Main {
    public static void CheckPowerOfTwo(int S) {
        int count = 0;
        int p = S;
        while (p > 0) {
            if ( (p & 1) == 1) {
                count++;
            }
            p=p>>1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Element");
        int S = Input.nextInt();
        CheckPowerOfTwo(S);
    }
}
