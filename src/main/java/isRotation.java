public class isRotation {
    boolean isRotation (String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0 ){
            String s1s1 = s1 + s1;
            return isSubstring (s1s1, s2);
        }
        return false;
    }

    boolean isSubstring (String s1s1, String s2) {
        //can be modified into a general version
        int len1 = s1s1.length(); // 2N
        int len2 = s2.length();   // N

        for (int i = 0; i <= len2; i++ ) {
            int j;
            for (j = 0; j < len2; j++) {
                if (s1s1.charAt(i+j) != s2.charAt(j)) break;
            }
            if (j == len2) return true;
        }
        return false;
    }
}
