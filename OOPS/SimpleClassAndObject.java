import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int N = Input.nextInt();
        System.out.println(" Enter the color :");
        String C= Input.next();
        Person P1 = new Person();
        P1.SetNumber(N);
        P1.Color(C);
        System.out.println();
        System.out.println(P1.Number);
        System.out.println(P1.Color);

    }
}

class Person{
  int Number;
  String Color;
  void SetNumber(int N){
    Number=N;
  }
  void Color(String C){
    Color=C;
  }
}
