import java.util.*;

public class selectionSort{

	public static void sort(int []arr,int s,int e,int idx){

		if(e==0)return;

		if(s<e){
			if(arr[s]>arr[idx]){
				idx=s;
			}
			sort(arr,s+1,e,idx);
		}
		else{
			int temp=arr[idx];
			arr[idx]=arr[e-1];
			arr[e-1]=temp;
			sort(arr,0,e-1,0);
		}

	}

	public static void main(String []args){

		int []arr={5,6,4,3,3,2,8,1};
		sort(arr,0,8,0);

		for(int el:arr){
			System.out.println(el);
		}

	}
}