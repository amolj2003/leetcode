import java.util.Scanner;

class Main {
    public static void Bubble(int Num1[][]) {
        int sum=0;
        for(int j=0;j<Num1.length;j++){
         sum=sum+Num1[j][j];
        }
        int TotalCol = Num1.length-1; 
        for(int i=0;i<Num1.length;i++){
            sum=sum+Num1[i][TotalCol];
            TotalCol--;
        }  
        if(Num1.length%2==1){
            sum=sum-Num1[Num1.length/2][Num1.length/2];
        } 
       System.out.print(sum);
    }

    public static void main(String[] args) {
        int Array[][]= new int [4][4];
        Scanner Input = new Scanner(System.in);
        for(int i=0;i<Array.length;i++){
            for(int j=0;j<Array.length;j++){
                Array[i][j]= Input.nextInt();
            }
        }
        Bubble(Array);
    }
}
