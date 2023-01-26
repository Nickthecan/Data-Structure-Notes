//stack = LIFO data structure (Last in, First Out)
//        stores objects into a sort of "vertical tower"
//        push() to add to the top
//        pop() to remove from the top

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        //creating a stack object
        Stack<Integer> stack = new Stack<>();

        //checking if the stack is empty
        System.out.println(stack.isEmpty());

        //pushing Integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        //removing from the stack
        stack.pop();
        System.out.println(stack);

        //checking the top of the stack
        System.out.println(stack.peek());

        //search for an object from the top of the list
        //returns -1 if not found
        System.out.println(stack.search(2));

        //uses of stacks
        //1. undo/redo features in text editors
        //2. moving back/forward through browser history
        //3. backtracking algorithms (mazes, file directories)
        //4. calling functions (call stack)
    }
}
