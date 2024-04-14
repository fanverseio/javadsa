package LinkedLists;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // O(1) time complexity
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert new node

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) { // if there's no head, there's no singlylinkedlist, so we create one and just
                            // put it there.
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node; // TODO ??
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) { // get location value and see where exactly it's inserting.
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next; // get the reference of tempNode to the original nextNode.
            tempNode.next = node; // put node next to tempNode
            node.next = nextNode; // conect the node to the reference to the original linkedlist.
        }
        size++;
    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("LinkedList doesn't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;

            }
        }
        System.out.println();
    }

    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found value " + tempNode.value + " at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The SinglyLinkedList doesn't exist.\n");
            return;
        } else if (location == 0) { // delete the first element
            head = head.next; // so pointing the reference to the next node so it's safe to delete the head
            size--;
            if (size == 0) {
                tail = null;
                System.out.println("The SinglyLinkedList has been deleted.\n");
            }
        } else if (location >= size) { // delete the last element
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // only one element
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null; // not only one element
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // skipping the node to be deleted.
            size--;
        }
    }

    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("SinglyLinkedList deleted successfully.");

    }

    public void push(int nodeValue) {
        if (size < 1) {
            insertInLinkedList(nodeValue, 0);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }

    }

    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if (head == tail) {
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;

        return removeNode;

    }

    public int get(int location) {

        if (head == null) {
            System.out.println("Linkedlist doesn't exist.");
            return -1;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location; i++) {
                if (tempNode.next != null) {
                    tempNode = tempNode.next;
                } else {
                    System.out.println("Location is out of bound.");
                    return -1;
                }
            }
            return tempNode.value;
        }
    }

    public void rotate(int location) {
        if (head == null) {
            System.out.println("Linkedlist doesn't exist.");
        } else if (location > size || location < 0) {
            System.out.println("Index out of bound.");
        } else {
            Node headTempNode = head;
            Node tailTempNode = head;
            for (int i = 0; i < location; i++) {
                tailTempNode = headTempNode;
                headTempNode = headTempNode.next;
            }
            tail.next = head;
            head = headTempNode;
            tail = tailTempNode;
            tail.next = null;
        }
    }

    public void set(int nodeValue, int location){
        if (head == null){
            System.out.println("Linkedlist doesn't exist.");
        } else if (location > size || location < 0){
            System.out.println("Index out of bound.");
        } else {
            Node tempNode = head;
            for (int i = 0;i<location;i++){
                tempNode = tempNode.next;
            }
            tempNode.value = nodeValue;
        }
    }

    public void delete(int location){
        if (head == null){
            System.out.println("Linkedlist doesn't exist.");
        } else if (location > size || location < 0){
            System.out.println("Index out of bound.");
        } else {
            Node tempNode = head;
            for (int i = 0; i < location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size --;
        }
    }

}
