package StackExercises;


public class MainStack {

    public static void main(String[] args) {

        // Stack using array method
        /*

        Stack stk = new Stack(6);
        stk.push(2);
        stk.push(4);
        stk.push(7);
        stk.push(1);
        stk.push(8);
        stk.push(4);
        stk.printStack();
        stk.pop();
        stk.printStack();

         */


        // Stack using linkedlist method.
        StackLinkedList stackLL = new StackLinkedList();
        stackLL.push(5);
        stackLL.push(7);
        stackLL.push(9);
        stackLL.printStack();
        System.out.println(stackLL.pop());
        stackLL.printStack();





    }
}
