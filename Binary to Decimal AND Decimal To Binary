import java.util.Scanner;

class Main{
    public static int  DeciToBinary(int DB){
        int pow=0;
        int BinNum=0;

        while(DB>0){
          int rem = DB % 2 ;
          BinNum = BinNum + (rem *(int)(Math.pow(10,pow)));
          pow++;
          DB = DB/2;  
        }
        
        return BinNum;
    }
    public static int BinaryToDecimal( int BD) {
         int pow=0;
         int Decimal=0;
         while(BD>0){
            int rem=BD%10;
            Decimal=Decimal+(rem*(int)(Math.pow(2,pow)));
            BD=BD/10;
            pow++;
         }

        return Decimal; 
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("If You Want To Convert Decimal To Binary : 1 ");
        System.out.println("If You want To Convert Binary To Decimal : 2 ");
        int Option =input.nextInt();

        switch (Option) {
            case 1:
                int DB = input.nextInt();
                int L = DeciToBinary(DB);
                System.out.println(L);
                break;
            case 2:
                int BD = input.nextInt();
                int T = BinaryToDecimal(BD);
                System.out.println(T);
                break;
            default:
                break;
        }
       
    }
}
