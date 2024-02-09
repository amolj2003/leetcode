import java.util.Scanner;

class Main {
    public static int Factorial(int Number){
        if(Number > 1){
            return Number * Factorial(Number - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int Number = 5; 
        int Fact = Factorial(Number);
        System.out.println(Fact);
    }
}
