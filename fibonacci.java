public class fibonacci{

	static int printFibonnaci(int n){
		
		if(n<2)return n;

		return printFibonnaci(n-1)+printFibonnaci(n-2);
	}

	public static void main(String []args){
		int n=10;
		System.out.println(printFibonnaci(6));
	}
}