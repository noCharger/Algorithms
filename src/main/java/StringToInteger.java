/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: math, valid number
 * Note: watch for conner case, Shown up during interview, but controversial
 * level: medium
 * Time cost: O(n)
 * Space cost: O(1)
 * Methodology: figure out conner cases
 */

public class StringToInteger {
    /**
     * conner cases
     * 1. + -
     * 2. valid
     * 3. overflow
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;
        str = str.trim();

        //check all space conner case
        if (str.length() == 0) return 0;

        char firstChar = str.charAt(0);
        int sign = 1;
        int start = 0; //start pointer
        long res = 0;  //overflow

        if (firstChar == '+') {
            sign = 1;
            start ++;
        } else if (firstChar == '-') {
            sign = -1;
            start ++;
        }

        //string to integer
        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) res * sign;
            }
            res = res * 10 + str.charAt(i) - '0';

            //check overflow
            if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && res > Integer.MAX_VALUE) return  Integer.MIN_VALUE;

        }
        return (int) res * sign;
    }
}

