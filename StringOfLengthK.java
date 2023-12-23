import java.util.*;

class recCall{
	public void printAllKLength(char []set,int k){
		int n=set.length;
		printAll(set,"",n,k);
	}

	public void printAll(char []set,String prefix,int n,int k){
		if(k==0){
			System.out.println(prefix);
			return;
		}

		for(int i=0; i<n; i++){
			String newPrefix=prefix+set[i];
			printAll(set,newPrefix,n,k-1);
		}

	}
}

public class StringOfLengthK{

	public static void main(String []args){
		
		recCall rec=new recCall(); 

		System.out.println("First Test");
    	char[] set1 = {'a', 'b'};
    	int k = 3;
    	rec.printAllKLength(set1, k);
     	
     	/*
    	System.out.println("\nSecond Test");
    	char[] set2 = {'a', 'b', 'c', 'd'};
    	k = 1;
    	printAllKLength(set2, k);
    	*/ 
	}
}