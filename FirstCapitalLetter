import java.util.Scanner;

class Main {
    public static void FirstCapitalLetter(String Str) {
      
      StringBuilder sb = new StringBuilder();
      char ch =Character.toUpperCase(Str.charAt(0));
      sb.append(ch);
      for(int i=1;i<Str.length();i++){
        if(Str.charAt(i)== ' ' && i!=Str.length()-1){
          i++;
          sb.append(" ");
          ch = Character.toUpperCase(Str.charAt(i));
          sb.append(ch); 
        }
        else{
          sb.append(Str.charAt(i));
        }
      }
        System.out.print(sb);
      }


    public static void main(String[] args) {
        String Str = "hello i am amol jaiswal";
        FirstCapitalLetter(Str);
    }
}
