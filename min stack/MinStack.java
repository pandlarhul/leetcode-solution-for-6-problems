import java.util.*;

public class MinStack {

    LinkedList<Integer> minStack ;
    LinkedList<Integer> stack ;
    
    
    /** initialize your data structure here. */
    public MinStack() {
            minStack = new LinkedList<Integer>();
            stack = new LinkedList<Integer>();
    }   
    
    public void push(int x) {
        stack.add(0,x);
        if(minStack.size() > 0){
            if(minStack.get(0) >= x){
                minStack.add(0,x);
            }else {
                minStack.add(0,minStack.get(0));
            }
        }else {
            minStack.add(0,x);
        }
    }
    
    public void pop() {
        stack.remove(0);
        minStack.remove(0);
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int getMin() {
        return minStack.get(0);
    }
}

