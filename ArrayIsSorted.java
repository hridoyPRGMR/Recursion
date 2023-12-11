public class ArrayIsSorted{

	/*
	public static boolean sort(int []nums,int idx,int size){
		if(idx==size)return true;
		if(nums[idx]<=nums[idx+1]){
			return sort(nums,idx+1,size);
		}
		else{
			return false;
		}
	}
	*/

	public static boolean sort(int []nums,int n){
		if(n==0 || n==1)return true;

		if(nums[n-1]<nums[n-2])return false;

		return sort(nums,n-1);
	}

	public static void main(String []args){
		int []nums={5,2};
		int n=nums.length;

		//System.out.println(sort(nums,0,n-1));
		System.out.println(sort(nums,n));
	}
}
