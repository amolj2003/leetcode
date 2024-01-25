 class Main {
    public static void Bubble(int Num1[]) {
        int Count[] = new int[Num1.length+5];
        for(int i=0;i<Num1.length;i++){   
         Count[Num1[i]]=Count[Num1[i]] + 1;
        }
        for(int i=0;i<Count.length;i++){
            while(Count[i]>0){
                System.out.println(i);
                Count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = {7,1,5,3,6,4, 1};
        Bubble(num1);
    }
}
