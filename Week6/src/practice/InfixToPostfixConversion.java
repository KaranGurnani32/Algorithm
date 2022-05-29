package practice;

import java.util.Stack;

public class InfixToPostfixConversion {
    public static void main(String[] args) {
        String expression = "A-B^C+D*E-F+G/H";

        System.out.println("expression = " + expression);

        String postfixExpression = convertToPostFix(expression);
        String infixExpression = convertToInfix(postfixExpression);

        System.out.println("postfixExpression = " + postfixExpression);
        System.out.println("infixExpression = " + infixExpression);
    }

    private static String convertToInfix(String expression) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            Character symbol = expression.charAt(i);

            if (isOperand(symbol)) {
                stack.push(symbol + "");
            } else {
                String a = stack.pop();
                String b = stack.pop();
                stack.push(solve(a, b, symbol));
            }
        }

        return stack.peek();
    }

    private static boolean isOperand(Character symbol) {

        if (symbol >= 'a' && symbol <= 'z') {
            return true;
        } else if (symbol >= 'A' && symbol <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    private static String solve(String a, String b, Character operator) {
        return "( " + b + operator + a + ")";
    }

    private static String convertToPostFix(String expression) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {

            Character symbol = expression.charAt(i);

            // open bracket - push
            if (symbol == '(') {
                stack.push(symbol);
            } // stack empty - push
            else if (Character.isLetter(symbol)) {
                result.append(symbol);
            } else if (stack.isEmpty()) {
                stack.push(symbol);
            } // close bracket - pop till open bracket
            else if (symbol == ')') {
                while (stack.peek() == '(') {
                    Character top = stack.pop();
                    System.out.println("top = " + top);
                    result.append(top);
                }
                stack.pop(); // It will pop open bracket
            } else if (precedence(symbol) > precedence(stack.peek())) {
                stack.push(symbol);
            } else if (precedence(symbol) <= precedence(stack.peek())) {
                while (!stack.isEmpty() && precedence(symbol) <= precedence(stack.peek())) {
                    Character top = stack.pop();
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
    } // ABC^-DE*+F-GH/+
}
