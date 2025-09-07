class ToDoMain {

    public static void main(String[] args) {
        System.out.println("What would you like to name your task?");
        String taskName;
        try (Scanner scn = new Scanner(System.in)) {
            taskName = scn.nextLine();
        }

        Task task = new Task(taskName);
        System.out.println("To-Do List:");
        System.out.println(task.getName());
        // TODO: Make linked list to store the todo list
    }
}
