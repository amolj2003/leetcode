import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       String Pass = Sc.next();
       ChangePassword CP = new ChangePassword();
       CP.ChangePassword(Pass) ;
       System.out.println(CP.Password); // this will give error due to accesing the private object from outside the package 
    }
}

class ChangePassword{
  private String Password ;
  void ChangePassword(String Pass){
       Password = Pass;
  }
  
}
