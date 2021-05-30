package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class balancedBrackets {
    static boolean findBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
                continue;
            }

            if (st.isEmpty()) {
                return false;
            }
            char check;
            switch (c) {
                case ')':
                    check = st.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = st.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = st.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(findBalanced(s));
    }
}