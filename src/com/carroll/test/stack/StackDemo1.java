package com.carroll.test.stack;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.size());
        // stack.pop()方法调用后，stack.size()的长度会跟着减一
        stack.pop();
        System.out.println(stack.size());
    }
}
