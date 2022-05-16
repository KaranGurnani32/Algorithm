package queuebystack;

import java.util.Stack;

public class MyQueue {
    Stack s1;
    Stack s2;

    void push(int data) {
        s1.push(data);
    }

    int pop() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int ans = (int) s2.pop();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }

        return ans;
    }

    int peek() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int ans = (int) s2.peek();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }

        return ans;
    }
}
