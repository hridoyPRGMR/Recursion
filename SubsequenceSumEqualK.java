import java.util.ArrayList;
import java.util.List;

class Solution{

    private void generate(List<Integer>nums,int idx,int sum,int k,List<Integer>sequence){
        if(idx>=nums.size()){
            if(sum==k){
                System.out.println(sequence);
            }
            return;
        }
        sum+=nums.get(idx);
        sequence.add(nums.get(idx));
        generate(nums, idx+1, sum, k, sequence);
        sum-=nums.get(idx);
        sequence.remove(sequence.size()-1);

        generate(nums,idx+1,sum,k,sequence);

    }

    public void subSequenceSumEqualK(List<Integer>nums,int k){
        List<Integer>sequence=new ArrayList<>();
        int sum=0;
        generate(nums,0,sum,k,sequence);
    }
}

public class SubsequenceSumEqualK {
    public static void main(String []args){
        List<Integer>nums=new ArrayList<>();
        nums.add(17);
        nums.add(18);
        nums.add(6);
        nums.add(11);
        nums.add(2);
        nums.add(4);
        int k=6;
        Solution sln=new Solution();
        sln.subSequenceSumEqualK(nums,k);
    }
}
