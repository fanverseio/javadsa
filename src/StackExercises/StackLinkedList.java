package StackExercises;
import LinkedLists.SinglyLinkedList;

import java.util.LinkedList;

public class StackLinkedList {
    SinglyLinkedList linkedList;


    public StackLinkedList() {
        linkedList = new SinglyLinkedList();
    }

    public void push(int value){
        linkedList.insertInLinkedList(value,0);
        System.out.println("Inserted " + value + " in stack.");
    }

    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        } else {
            return false;
        }
    }

    public int pop(){
        int res = -1;
        if (isEmpty()){
            System.out.println("The stack is empty");
            return res;
        } else {
            res = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return  res;
    }

    public void printStack(){
        if (linkedList.head == null){
            System.out.println("The stack is empty!");
        } else{
            linkedList.traverseSinglyLinkedList();
        }
    }

    public int peek(){
        int res = -1;
        if (linkedList.head == null){
            System.out.println("The stack is empty");
            return res;
        } else {
            res = linkedList.head.value;
        }
        return res;
    }

    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted!");
    }
}
