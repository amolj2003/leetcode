    import java.util.Scanner;
    class Main{
    public static void main(String[] args) {
        int number;
        Scanner Input = new Scanner(System.in);
        System.out.println(" Enter The Number to form a table : ");
        number=Input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(" "+number+"*"+ i + "= " +(number*i));
        }
        }
    }
