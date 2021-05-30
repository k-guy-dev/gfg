package pepQue.Level1.basicDs.stacksAndQueues;

import java.util.*;

class infixEvaluation {
    static int evaluate(String s) {
        Stack<Integer> numbers = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                    i++;
                    if (i < s.length()) {
                        c = s.charAt(i);
                    } else {
                        break;
                    }
                }
                i--;
                numbers.push(num);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    int output = performOperation(numbers, operators);
                    numbers.push(output);
                }
                operators.pop();
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    int output = performOperation(numbers, operators);
                    numbers.push(output);
                }
                operators.push(c);
            }
            while (!operators.isEmpty()) {
                int output = performOperation(numbers, operators);
                numbers.push(output);
            }
        }
        return numbers.pop();
    }

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static int performOperation(Stack<Integer> numbers, Stack<Character> operations) {
        int a = numbers.pop();
        int b = numbers.pop();
        char operation = operations.pop();
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0;
    }

    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '/' || c == '*' || c == '^');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

    }
}