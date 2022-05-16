package stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String expression = "A-B^C+D*E-F+G/H";
        System.out.println("expression = " + expression);

        String postfixExpression = convertToPostFix(expression);

        System.out.println("postfixExpression = " + postfixExpression);
    }

    private static String convertToPostFix(String expression) {
        Stack<Character> stack = new Stack<>();

        // It is mutable i.e it can change without changing the address
        StringBuilder result = new StringBuilder();

        //scan through the expression
        //consider each character and deal accordingly

        for (int i = 0; i < expression.length(); i++) {
            Character symbol = expression.charAt(i);
            System.out.println("=============================");
            System.out.println("step " + (i+1) + ": scanned symbol is : " + symbol);
            System.out.println("stack = " + stack);
            System.out.println("result = " + result);
            System.out.println("=============================");

            //if symbol is open bracket always push to stack
            if (symbol == '(') {
                stack.push(symbol);
            } // if symbol is alphabet then always insert it to the resulting string
            else if (Character.isLetter(symbol)) {
                result.append(symbol);
            } // if symbol is closed bracket then pop the stack until open bracket comes
            else if (symbol == ')') {
                while (stack.peek() != '(') {
                    Character top = stack.pop();
                    result.append(top);
                }
                stack.pop(); // this will remove open bracket 
            } else if (stack.isEmpty()) {
                stack.push(symbol);
            } else if (precedence(symbol) > precedence(stack.peek())) {
                stack.push(symbol);
            } else if (precedence(symbol) <= precedence(stack.peek())) {
                while (!stack.isEmpty() && precedence(symbol) <= precedence(stack.peek())) {
                    Character top = stack.pop();
                    System.out.println("top = " + top);
                    result.append(top);
                }
                stack.push(symbol);
            } else {
                return null;
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    private static int precedence(Character symbol) {
        int value = -1;

        switch (symbol) {
            case '+':
            case '-': value = 1;
            break;
            case '*':
            case '/': value = 2;
            break;
            case '^': value = 3;
            break;
        }

        return value;
    }
}
