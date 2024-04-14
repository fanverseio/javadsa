package LinkedLists;

public class MainLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6,1);
        System.out.println(sLL.tail.value);
        sLL.insertInLinkedList(3,0);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(4,1);
        System.out.println(sLL.head.next.value);

        sLL.traverseSinglyLinkedList();
        sLL.searchNode(5);
        sLL.searchNode(10);

        sLL.deleteNode(1);
        sLL.traverseSinglyLinkedList();

        sLL.pop();
        sLL.traverseSinglyLinkedList();
        sLL.insertInLinkedList(10,5);
        sLL.traverseSinglyLinkedList();
        System.out.println(sLL.get(1));
        sLL.push(9);
        sLL.traverseSinglyLinkedList();
        sLL.rotate(2);
        sLL.traverseSinglyLinkedList();
        sLL.set(2,1);
        sLL.traverseSinglyLinkedList();
        sLL.delete(2);
        sLL.traverseSinglyLinkedList();
        sLL.push(11);
        sLL.push(13);
        sLL.push(45);
        sLL.traverseSinglyLinkedList();
        sLL.delete(3);
        sLL.traverseSinglyLinkedList();



    }
}
