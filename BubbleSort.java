 class Main {
    public static void Bubble(int Num1[]) {
        
        for(int i=0;i<Num1.length;i++){
            for(int j=0;j<Num1.length-1;j++){
                if(Num1[j]>Num1[j+1]){
                    int temp = Num1[j+1];
                    Num1[j+1]=Num1[j];
                    Num1[j]=temp;
                }
            }
        }
        for(int i=0;i<Num1.length;i++){
            System.out.print( " " + Num1[i]);
        }

        }

    public static void main(String[] args) {
        int[] num1 = {7,1,5,3,6,4};
        Bubble(num1);
    }
}
