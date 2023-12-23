import java.util.Scanner;

public class NlengthBinSeq {

    public static void binarySeq(int n, int idx, String bin, String seq) {
        if (idx == n) {
            int sum1=0,sum2=0;
            for (int i = 0; i <n/2; i++) {
                int digit = seq.charAt(i) - '0';
                if (i < n / 2)sum1 += digit; 
                else sum2 += digit; 
            }            
            if(sum1==sum2){
                System.out.println(seq);
            }
            return;
        }

        for (int i = 0; i < 2; i++) {
            String newSeq = seq + bin.charAt(i);
            binarySeq(n, idx + 1, bin, newSeq);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        binarySeq(n*2, 0, "01", "");
    }
}
