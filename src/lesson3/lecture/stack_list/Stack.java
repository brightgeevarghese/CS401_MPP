package lesson3.lecture.stack_list;

import java.util.ArrayList;

//Stack is a List (Stack extends from ArrayList)
public class Stack<T> extends ArrayList<T> {//Stack is a List
      private int stackPointer = -1;

      public void push(T item) {
//          add(item);
          add(++stackPointer, item);
      }

      public T pop() {
          T removedData = remove(stackPointer);
          stackPointer--;
          return removedData;
      }

    @Override
    public void clear() {
        super.clear();
        stackPointer = -1;
    }
}

class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        System.out.println("Status : "+integerStack);
        System.out.println("Removed "+integerStack.pop());
        System.out.println("Status : "+integerStack);
        integerStack.clear();
        integerStack.push(5);
    }
}