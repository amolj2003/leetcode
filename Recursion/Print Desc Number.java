import java.util.Scanner;

class Main {
    public static void descnum(int s){
     if(s>0){
      System.out.println(s);
      descnum(s-1);
     }
    }

    public static void main(String[] args) {
        int s = 10;
        descnum(s);

    }
}
