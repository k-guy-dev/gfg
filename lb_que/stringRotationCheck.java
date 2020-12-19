package lb_que;

import java.util.*;

class stringRotationCheck {

    static boolean rotationCheck(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        boolean b = rotationCheck(s1, s2);
        System.out.println(b);
    }
}