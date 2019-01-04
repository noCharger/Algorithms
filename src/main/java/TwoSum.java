import java.util.HashMap;
import java.util.Map;

/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: math
 * Note: very important
 * level: easy
 * Time cost: O(n)
 * Space cost: O(n)
 * Methodology:
 * Further related: distinct number -> duplicate, all combinations
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //traverse the array and store in hash map (value,index)
        //not necessary, can traverse once if exactly one soln
        //then perform found -> union found
        //and duplicate

        //edge case
        if (nums == null || nums.length < 2){
            return new int[]{-1,-1};
        }

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int res[] = new int[]{-1,-1};

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return res;

    }
}
