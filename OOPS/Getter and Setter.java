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
        System.out.println(P1.getColor());
        System.out.println(P1.getNumber());

    }
}

class Person{
  private int Number;
  private String Color;
  int getNumber(){
   return this.Number;
  }
  String getColor(){
   return this.Color;
  }
  void SetNumber(int N){
    Number=N;
  }
  void Color(String C){
    Color=C;
  }
}
