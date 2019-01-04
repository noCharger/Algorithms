/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: math
 * Note: very important
 * level: easy
 * Time cost: O(n)
 * Space cost: O(1)
 * Methodology:
 * Further related: distinct number -> duplicate, all combinations
 */

public class TwoSumII {
    //sorted version
    //very easy
    //duplication?
    //note: index is 1-indexed instead of 0-indexed
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2){
            return new int[]{-1,-1};
        }
        int res[] = new int[]{-1,-1};
        int startPtr = 0;
        int endPtr = numbers.length -1;
        int tempSum = 0;
        while (startPtr < endPtr){
            tempSum = numbers[startPtr]+numbers[endPtr];
            if (tempSum == target) {
                res[0] = startPtr+1;
                res[1] = endPtr+1;
                break;
            }else if (tempSum < target) {
                startPtr ++;
            }else {
                endPtr --;
            }
        }

        //More concise code:
//        int l = 0, r = numbers.length - 1;
//        while (numbers[l] + numbers[r] != target) {
//            if (numbers[l] + numbers[r] > target) {
//                r--;
//            }
//            else l++;
//        }
//        return new int[]{l + 1, r + 1};

        return res;

    }
}
