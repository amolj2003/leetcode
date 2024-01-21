import java.util.Scanner;

class main{
    public static int factorial(int N){
        int i=1;
        while (N>0){
            i=i*N;
            N--;
        }
        return i;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N =input.nextInt();
        int R=input.nextInt();
        int D = N-R;
        int Nfac=factorial(N);
        int Rfac=factorial(R);
        int Dfac=factorial(D);
        int BinomialCoeff = Nfac/(Rfac*Dfac);
        System.out.println(BinomialCoeff);
    }
}
