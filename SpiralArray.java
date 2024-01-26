import java.util.Scanner;

class Main {
    public static void SpiralArray(int Num1[][]) {
        int StartC=0;
        int StartR=0;
        int EndC=Num1.length-1;
        int EndR=Num1.length-1;
        while (StartR<EndR && StartC<EndC) {
         // Top Row : 
         for(int i=StartC;i<=EndC;i++){
            System.out.print(Num1[StartR][i]+" ");
         }
         //End coloumn :
         for(int i=StartR+1;i<=EndR;i++){
            System.out.print(Num1[i][EndC]+" ");
         }
         //End Row :
         for(int i=EndC-1;i>=StartC;i--){
            System.out.print(Num1[EndR][i]+ " ");
         }

         //Start Column :
         for(int i=EndR-1;i>=StartR+1;i--){
            System.out.print(Num1[i][StartC]+" ");
         }
         StartC++;
         StartR++;
         EndC--;
         EndR--; 
         
        } 
        if(Num1.length%2==1) {
         System.out.print(Num1[Num1.length/2][Num1.length/2]);
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
        SpiralArray(Array);
    }
}
