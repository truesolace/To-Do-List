public class Node {

    public Node(String taskName) {
        Task tmpTask = new Task(taskName);
        this.task = tmpTask;
        this.next = null;
    }
    
    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public void setTask(Task newTask) {
        this.task = newTask;
    }

    public Node getNext() {
        return next;
    }

    public Task getTask() {
        return task;
    }
    
    private Node next;
    private Task task;
}
