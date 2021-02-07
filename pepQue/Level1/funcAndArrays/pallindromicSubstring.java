package pepQue.Level1.funcAndArrays;

import java.util.*;

class pallindromicSubstring {

    static void expand(String s, int low, int high, Set<String> set) {
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            set.add(s.substring(low, high + 1));
            low--;
            high++;
        }
    }

    public static void allPallindrome(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i, set);
            expand(s, i, i + 1, set);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        allPallindrome(s);
    }
}