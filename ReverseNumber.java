import java.util.*;

public class ReverseNumber {
    /*
    public static int reverse(int n, int reversedNum) {
        if (n == 0) {
            return reversedNum;
        }

        int lastDigit = n % 10; // Extract the last digit
        reversedNum = reversedNum * 10 + lastDigit; // Update the reversed number

        return reverse(n / 10, reversedNum); // Recursively process the remaining digits
    }
    */

    public static int reverse(int n){
    	if(n<10){
    		return n;
    	}
    	else{
    		int lastDigit=n%10;
    		int remaining=n/10;
    		int numberOfDigit=(int)Math.log10(remaining)+1;
    		return lastDigit*(int)Math.pow(10,numberOfDigit)+reverse(remaining);
    	}
    }
	
    public static void main(String[] args) {
        int num = 142;
        int reversed = reverse(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }
}
