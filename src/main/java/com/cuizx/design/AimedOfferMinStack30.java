package com.cuizx.design;

import java.util.Stack;

public class AimedOfferMinStack30 {

    Stack<Integer> mainStack;
    Stack<Integer> utilStack;

    public AimedOfferMinStack30() {
        mainStack = new Stack<>();
        utilStack = new Stack<>();
    }
    public void push(int x) {
        mainStack.push(x);
        //报了空指针异常
//        if (x < utilStack.peek() || utilStack.isEmpty()) {
//            utilStack.push(x);
//        }
        if (utilStack.isEmpty() || utilStack.peek() > x) {
            utilStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            if (utilStack.peek() == mainStack.peek()) {
                utilStack.pop();
            }
            mainStack.pop();
        }
    }

    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        } else {
            throw new RuntimeException("操作非法");
        }
    }

    public int min() {
        if (!utilStack.isEmpty()) {
            return utilStack.peek();
        } else {
            throw new RuntimeException("操作非法");
        }
    }

//    private Stack<Integer> main;
//    private Stack<Integer> helper;
//    /** initialize your data structure here. */
//    public MinStack() {
//        main = new Stack<>();
//        helper = new Stack<>();
//    }
//    public void push(int x) {
//        main.add(x);
//        if (helper.isEmpty()||helper.peek()>=x){
//            helper.add(x);
//        }
//    }
//
//    public void pop() {
//        if(!main.isEmpty()){
//            if(helper.peek().equals(main.peek())){
//                helper.pop();
//            }
//            main.pop();
//        }
//    }
//
//    public int top() {
//        if(!main.isEmpty()){
//            int peek = main.peek();
//            return peek;
//        }else{
//            throw new RuntimeException("操作非法");
//        }
//    }
//
//    public int min() {
//        if(!helper.isEmpty()){
//            int min = helper.peek();
//            return min;
//        }else{
//            throw new RuntimeException("操作非法");
//        }
//    }

}
