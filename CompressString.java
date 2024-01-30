import java.util.Scanner;

class Main {
    public static void CompressString(String Str) {

      StringBuilder sb = new StringBuilder();
      for(int i=0;i<Str.length();i++){
        int count = 1;
        while(i<Str.length()-1 && Str.charAt(i)==Str.charAt(i+1)){
          i++ ;
          count++ ;
        } 
        sb.append(Str.charAt(i));
        if(count>1){
          sb.append(count);
        }
      }
      System.out.print(sb);
}


    public static void main(String[] args) {
        String Str = "aaabbcccddd";
        CompressString(Str);
    }
}
