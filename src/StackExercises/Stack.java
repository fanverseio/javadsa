package StackExercises;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full!");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is sucessfully added!");
        }
    }

    public int[] pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return arr;
        } else {
            arr[topOfStack] = 0;
            topOfStack--;
            return arr;
        }
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]\n");
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty!");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    public void delete(){
        arr = null;
        System.out.println("The stack is deleted!");
    }



}
