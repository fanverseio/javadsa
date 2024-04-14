package CircularSinglyLinkedList;

public class MainCircularSinglyLinkedList {

    public static void main(String[] args) {

        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCircularSinglyLinkedList(5);
        cSLL.insert(3,0);
        System.out.println(cSLL.head.value);
        cSLL.insert(10,3);
        System.out.println(cSLL.tail.value);
        cSLL.traverseLinkedList();
        System.out.println(cSLL.search(12));
        System.out.println(cSLL.search(3));
        cSLL.insert(15,3);
        cSLL.traverseLinkedList();
        cSLL.delete(1);
        cSLL.traverseLinkedList();



    }
}
