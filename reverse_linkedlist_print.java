import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    SinglyLinkedListNode head;
    SinglyLinkedListNode tail;

    public void insertNode(int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }
}

public class Solution {

    public static void reversePrint(SinglyLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode current = head;

        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            SinglyLinkedList list = new SinglyLinkedList();

            for (int i = 0; i < n; i++) {
                list.insertNode(scanner.nextInt());
            }

            reversePrint(list.head);
        }

        scanner.close();
    }
}
