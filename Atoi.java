import java.util.Scanner;

public class Atoi {
    public static int atoi(String str,int n){
        if(n<0)return 0;
        char ch=str.charAt(n);
        
        if(!Character.isDigit(ch))return -1;
        
        return atoi(str,n-1) * 10 + (ch-'0');
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        in.close();

        int n=str.length();
        System.out.println(atoi(str,n-1));
    }
}