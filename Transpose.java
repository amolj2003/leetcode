import java.util.Scanner;

class Main {
    public static void Bubble(int Num1[][]) {
       int Transpose[][] = new int[4][2]; 
       for(int i=0;i<4;i++){
        for(int j=0;j<2;j++){
          Transpose[i][j]=Num1[j][i];
        }
       }
       for(int i =0; i< 4 ;i++){
        for(int j=0;j<2;j++){
          System.out.print(" " +Transpose[i][j]);
        }
        System.out.println();
       }
      }


    public static void main(String[] args) {
        int Array[][]={{1,2,3,4},{5,6,7,8}};
        Bubble(Array);
    }
}
