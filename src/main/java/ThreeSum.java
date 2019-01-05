import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: math
 * Note: very important, 1. has duplicates but not repeated solutions -> sort 2. all combinations 3. unsorted 4. ArrayList
 * level: medium
 * Time cost: O(n^2)
 * Space cost: O(n)
 * Methodology: 1. sort array -> remove duplicates
 *  2. lower dimension
 *  3. perform 2 sum for each case, find one unique solution
 *  4. combine all the solutions
 * Further related: solve it without sort:
 */


public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums); // O(n log n)
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = nums.length-1;
            int target = -nums[i];

            //this is also soln for all i
            while (low < high) {
                if (nums[low] + nums[high] == target){
                    //arrays library
                    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    //avoid duplicates
                    while (low < high && nums[low] == nums[low+1]) low ++;
                    while (low < high && nums[high]== nums[high-1]) high --;
                    low ++;
                    high --;
                } else if (nums[low] + nums[high] > target) {
                    high --;
                } else {
                    low ++;
                }
            }
        }

        return res;
    }
}
