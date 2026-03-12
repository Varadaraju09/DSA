class LL {
    Node head;
    private int size;

    public LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null; // We don't know the address of the next node
            size++; // Increment the size as soon as a node is created
        }
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // 1.
    public void addFirst(String data) {
        // Create a new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2.
    public void addLast(String data) {
        // Create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return; // stop if list was empty
        }

        // If there are multiple nodes , we need to fing the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // At the end of this loop we will add the newnode
        // Point the last node next pointer to the new node
        last.next = newNode;
    }

    // 3.
    public void removeFirst() {
        // Empty list - > cannot remove the head node.

        if (head == null) {
            System.out.println("List is empty. Can't delete the head!");
            return;
        }
        // For a single node, the head will point to the next head!
        // For multiple nodes, the head will point to the next (head.next)

        head = this.head.next;
        size--;
    }

    // 4.
    public void removeLast() {
        // Empty list - > cannot remove the head node.
        if (head == null) {
            System.out.println("List is empty. Can't delete the tail!");
            return;
        }

        // Single element in the list
        if (head.next == null) {
            head = null; // C / C++ style of code
            size--;
            return;
        }

        // Multiple elements in the list
        Node curr = head;
        Node last = head.next;
        while (last.next != null) {
            curr = last;
            last = last.next;
        }

        // The last node will be cleared by the JVM if not used
        // So, we point the SecondLast (Curr) node to null pointer
        curr.next = null;
        size--;
    }

    // 5.
    public void removeTarget(String target) {
        // Empty list - > cannot remove the head node.
        if (head == null) {
            System.out.println("List is empty. Can't delete the tail!");
            return;
        }
        // case : target is the head node itself
        if (head.data.equals(target)) {
            head = head.next;
            size--;
            return;
        }

        // case : target is anywhere on the list
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)) {
            prev = curr;
            curr = curr.next;
        }
        // Do a check to see if the curr pointer is null
        // if its null, the target is not found

        if (curr == null) {
            System.out.println("Target not found in the list!");
            return;
        }
        prev.next = curr.next; // Adjust the previous node & current node
        size--;
    }

    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("Dsa ");
        sll.addFirst("Learning ");
        sll.addFirst("are ");
        sll.addFirst("We ");
        sll.addFirst("null ");
        sll.printList();

        sll.addLast("in");
        sll.addLast("JAVA");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();

        sll.removeFirst();
        sll.printList();

        sll.removeLast();
        sll.printList();

        sll.removeTarget("Learning ");
        sll.printList();

        sll.removeTarget("Python");
        sll.printList();

    }
}