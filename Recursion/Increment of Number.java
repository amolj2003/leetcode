import java.util.Scanner;

class Main {
    public static void Incrnum(int s){
     if(s<=10){
      System.out.println(s);
      Incrnum(s+1);
     }
    }

    public static void main(String[] args) {
        int s = 0;
        Incrnum(s);

    }
}
