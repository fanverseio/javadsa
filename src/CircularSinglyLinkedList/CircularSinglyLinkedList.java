package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    String errorMsg = "No linkedlist found!";
    String valueNotFound = "Value not found!";

    public Node createCircularSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insert(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
            return;
        } else if (location < 0) {
            System.out.println("Error: index out of bound.");
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            node.next = head;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println(errorMsg);
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

    public int search(int nodeValue) { // find specific value in the linkedlist
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    return i;
                } else {
                    tempNode = tempNode.next;
                }
            }
            System.out.println(valueNotFound);
            return -1;

        } else {
            System.out.println(errorMsg);
            return -1;
        }
    }

    public void delete(int location) {
        if (head == null) {
            System.out.println(errorMsg);
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteLinkeList(){
        if (head == null){
            System.out.println(errorMsg);
            return;
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CircularSinglyLinkedList has been deleted!");
        }
    }
}
