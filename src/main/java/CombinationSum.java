import java.util.ArrayList;
import java.util.List;
/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: backtracking
 * Note: very important and basic, can have duplicates of element itself
 * level: medium
 * Time cost: O(2^n)
 * Space cost: O(n)
 * Methodology: Like a DFS, for each parent, children is the whole list, if "this path" not work, go back to parent node
 * Further related: 1. how to prove runtime 2. if input has duplicates
 */

public class CombinationSum {
    /**
     *
     * @param candidates: all unique numbers
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //brute force: list all combination of set O(n!)
        //back tracking
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return res;
        helper(candidates,target,0,res,new ArrayList<Integer>());
        return res;
    }

    void helper(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> list){
        if (target < 0) return;
        if (target == 0) {
            //new ArrayList(list) is to add a copy of list(create a new obj). Result.add(list) is adding a pointer to list, which keeps changing
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = start; i<candidates.length; i++){
//            System.out.println("add: "+candidates[i]);
            list.add(candidates[i]);                                                     //explore one of the children
            helper(candidates, target - candidates[i], i, res, list);
//            System.out.println("remove: "+list.get(list.size()-1));
            list.remove(list.size()-1);                                           //go back to the root
        }
    }

}

//Discussion on runtime and space complexity:

/**
 ** Absolute brute force: O(n * (m-1)^n) where m = target - smalles element
 ** backtracking solution: slightly less than brute force but what is it?
 ** Space complexity: O((m-1)^n) = number of root-> leaf paths or number of leaves
 */