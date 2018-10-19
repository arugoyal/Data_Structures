//javac Stack.java
//java stack_imp

import java.util.Stack;

class stack_imp {
     
    public void stack_push(Stack<Integer> stack) 
    { 
        for(int i = 0; i < 5; i++) 
        { 
            stack.push(i); 
        } 
    } 
       
    public void stack_pop(Stack<Integer> stack) 
    { 
        for(int i = 0; i < 5; i++) 
        { 
            Integer y = (Integer) stack.pop(); 
            System.out.println(y); 
        } 
    } 
 
    public void stack_peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println(element); 
    } 
      
    public static void main (String[] args) 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
        stack_imp s = new stack_imp();
        s.stack_push(stack); 
        s.stack_pop(stack); 
        s.stack_push(stack); 
        s.stack_peek(stack);  
    } 
}
