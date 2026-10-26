import java.util.*;
public class Permutation_Duplicate{
    Set<List<Integer>> ans = new HashSet<>();

    public List<List<Integer>> permute(int[] nums){
        helper(0, nums, new ArrayList<Integer>());

        List<List<Integer>> listOfLists = new ArrayList<>(ans);
        return listOfLists;
    }
    public void helper(int idx, int[] nums, ArrayList<Integer> curr){
        if (curr.size() == nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        for (int i = idx; i < nums.length; i++){
            if (i > idx && nums[i] == nums[i - 1]) continue;

            curr.add(nums[i]);

            swap(nums, i, idx);

            helper(idx + 1, nums, curr);

            swap(nums, i, idx);
            curr.remove(curr.size() - 1);
        }
    }
    public void swap(int[] nums, int i, int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    public static void main(String[] args) {
        Permutation_Duplicate soln = new Permutation_Duplicate();
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = soln.permute(nums);
        System.out.println(result);
    }
}