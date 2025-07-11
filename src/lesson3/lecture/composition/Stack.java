package lesson3.lecture.composition;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private List<T> list =  new ArrayList<T>();
    private int stackPointer = -1;

    public void push(T e) {
        list.add(++stackPointer, e);
    }

    public T pop() {
        return list.remove(stackPointer--);
    }
}

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
//        stack.clear();//cannot be invoked
    }
}
