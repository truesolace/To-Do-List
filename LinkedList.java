public class LinkedList {
    
    // Constructor
    public LinkedList() {
        head = null;
        tail = null;
    }

    public void push(String taskName) {
        Node newNode = new Node(taskName);
        // Empty list
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        // Non-Empty list
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void pop(String taskName) {
        Node pointer = head;
        // If the desired task is first, move head to next task
        if (pointer.getTask().getName() == taskName) {
            head = head.getNext();
        }
        // If it is not, traverse the list until it is found, then remove it
        else {
            while (pointer != null) {
                if (pointer.getNext().getTask().getName() == taskName) {
                    pointer.setNext(pointer.getNext().getNext())
                }
                else {
                    pointer = pointer.getNext();
                }
            }
        }
    }

    public void printList() {
        Node pointer = head;
        // Loop through the list and print every task name and completion status
        while (pointer != null) {
            if (pointer.getCompletion()) {
                System.out.println(pointer.getName() + "(x)");
            }
            else {
                System.out.println(pointer.getName() + "( )");
            }
        }
    }
    
    private Node head;
    private Node tail;
}
