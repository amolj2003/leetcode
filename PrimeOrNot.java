import java.util.Scanner;

class main{
    public static Boolean PrimeOrNot(int N){
     
        for(int i=2;i<=N-1;i++){
            if(N%i==0){
                return false;
            }
        }
       return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N =input.nextInt();
        Boolean Sol = PrimeOrNot(N);
        System.out.println(Sol);
    }
}
