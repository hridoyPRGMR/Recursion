import java.util.Scanner;

public class NlengthBinSeq {

    public static void binarySeq(int diff,char []seq,int start,int end) {
        
        if(Math.abs(diff)>(end-start+1)/2)return;

        if(start>end){
            if(diff==0){
                System.out.print(seq);
                System.err.println();
            }
            return;
        }

        seq[start]=seq[end]='0';
        binarySeq(diff, seq, start+1, end-1);

        seq[start]='0';
        seq[end]='1';
        binarySeq(diff+1, seq, start+1, end-1);

        seq[start]=seq[end]='1';
        binarySeq(diff, seq, start+1, end-1);

        seq[start]='1';
        seq[end]='0';
        binarySeq(diff-1, seq, start+1, end-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        char []seq=new char[2*n+1];
        seq[2*n]='\0';
        binarySeq(0,seq,0,2*n-1);
    }
}
