import java.util.Scanner;

class Main {
    public static int SumOfNumber(int Number){
        if(Number > 1){
            return Number + SumOfNumber(Number - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int Number = 5; 
        int Fact = SumOfNumber(Number);
        System.out.println(Fact);
    }
}
