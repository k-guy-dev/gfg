package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class duplicateBrackets {
    public static boolean findDuplicacy(String s) {
        Stack<Character> st = new Stack<Character>();
        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c == ')') {
                char top = st.peek();
                st.pop();
                int elementsInside = 0;

                while (top != '(') {
                    top = st.peek();
                    st.pop();
                    elementsInside++;
                }
                if (elementsInside < 1) {
                    return true;
                }
            } else {
                st.push(c);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (findDuplicacy(s)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}