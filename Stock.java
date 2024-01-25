 class Main {
    public static void Stock(int Num1[]) {
        
        int Buying_Price=Num1[0];
        int Selling_Price=0;
        int Profit=0;
        for(int i=1;i<Num1.length;i++){
            Buying_Price = Math.min(Buying_Price,Num1[i-1]);
            int pro=Num1[i]-Buying_Price;  
            Profit=Math.max(pro, Profit);         
        }
        System.out.println("Maximum Profit for the Stock will be : "+ Profit);
    }

    public static void main(String[] args) {
        int[] num1 = {7,1,5,3,6,4};
        Stock(num1);
    }
}
