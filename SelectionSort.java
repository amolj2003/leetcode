 class Main {
    public static void Bubble(int Num1[]) {
        
        for(int i = 0; i<Num1.length-1;i++){
            int LowIndex = i ; 
            for(int j=i+1;j<Num1.length-1;j++ ){
                if(Num1[j]<Num1[LowIndex]){
                    LowIndex = j;
                }
            }
            //Swaping Done here 
            int temp = Num1[i];
            Num1[i] = Num1[LowIndex];
            Num1[LowIndex] = temp;
        }
        // printing of array 
         for(int i=0;i<Num1.length;i++){
            System.out.print(" " + Num1[i]);
         }

        }

    public static void main(String[] args) {
        int[] num1 = {7,1,5,3,6,4};
        Bubble(num1);
    }
}
