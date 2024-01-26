import java.util.Scanner;

class Main {
    public static void Bubble(int Num1[][]) {
        int i=0;
        int key = 5;
        int j=Num1.length-1;
        while(i<Num1.length&&j>=0){
          // left 
          if(key<Num1[i][j]){
            j--;
          }
          else if(key>Num1[i][j]){
            i++;
          } 
          if(key==Num1[i][j]){
            System.out.print(" The key is at the location : "+"("+ i+ "," + j+")");
            break;
          } 
        }
    }

    public static void main(String[] args) {
        int Array[][]= new int [3][3];
        Scanner Input = new Scanner(System.in);
        for(int i=0;i<Array.length;i++){
            for(int j=0;j<Array.length;j++){
                Array[i][j]= Input.nextInt();
            }
        }
        Bubble(Array);
    }
}
