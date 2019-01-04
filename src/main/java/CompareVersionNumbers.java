/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: math
 * Note: String to integer, prime type variables, regex
 * level: medium
 * Time cost: O(n)
 * Space cost: O(n)
 * Methodology: seperate by '.', then compare one by one
 * Further related: update version numbers (show up on Apple campus interview)
 */

public class CompareVersionNumbers {
    /**
     * assume that the version strings are non-empty and contain only digits and the . character.
     * @param version1
     * @param version2
     * @return
     */
    public int compareVersion(String version1, String version2) {
        //seperate by '.'
        //then compare one by one
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length;
        int l2 = v2.length;
        for (int i=0; i<Math.max(l1,l2); i++) {
            int num1 = (i < l1)? Integer.parseInt(v1[i]) : 0;
            int num2 = (i < l2)? Integer.parseInt(v2[i]) : 0;
            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;
    }
}
