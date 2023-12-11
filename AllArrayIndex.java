import java.util.ArrayList;

public class AllArrayIndex {

    public static ArrayList<Integer> findAllIdx(int[] nums, int key, int idx, ArrayList<Integer> arr) {
        if (idx == nums.length) return arr;
        if (nums[idx] == key) arr.add(idx);
        return findAllIdx(nums, key, idx + 1, arr);
    }

    public static void main(String[] args) {
        int[] nums = {8, 3, 3, 5, 6, 2, 14, 3, 65, 3, 13};
        int key = 3;

        ArrayList<Integer> arr = new ArrayList<>();
        findAllIdx(nums, key, 0, arr);

        if (arr.isEmpty()) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.print("Indices of key " + key + " are: ");
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
