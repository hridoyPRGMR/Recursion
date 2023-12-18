import java.util.*;

public class bubbleSort{

	public static void sort(int []arr,int s,int e){

		if(e==0)return;

		if(s<e-1){
			if(arr[s]>arr[s+1]){
				int temp=arr[s];
				arr[s]=arr[s+1];
				arr[s+1]=temp;
			}
			sort(arr,s+1,e);
		}
		else{
			sort(arr,0,e-1);
		}

	}

	public static void main(String []args){

		int []arr={101,6,3,10,100};
		sort(arr,0,4);

		for(int el:arr){
			System.out.println(el);
		}

	}
}