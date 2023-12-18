import java.util.Scanner;

public class pattern{

	static void print(int n){
		if(n==0)return;
		for(int i=0; i<n; i++){
			System.out.print("* ");
		}
		System.out.println();
		print(n-1);
	}

	static void triangel(int r,int c){
		if(r==0)return;

		if(c<r){
			System.out.print("* ");
			triangel(r,c+1);
		}
		else{
			System.out.println();
			triangel(r-1,0);
		}
	}

	static void triangel2(int r,int c){
		
		if(r==0)return;

		if(c<r){
			triangel2(r,c+1);
			System.out.print("* ");
		}
		else{
			triangel2(r-1,0);
			System.out.println();
		}
	}


	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		//print(n);

		//triangel(n,0);
		triangel2(n,0);

		
	}
}