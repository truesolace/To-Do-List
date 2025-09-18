import java.io.*;
import java.util.Scanner;

class ToDoMain {

    public static void main(String[] args) {
        // TODO: Move prompt into while loop
        LinkedList list = new LinkedList();
        System.out.println("What would you like do do?");
        System.out.println("1 = Add Task");
        System.out.println("2 = Delete Task");
        System.out.println("3 = Mark task done/not done");
        System.out.println("0 = Quit");

        String userChoice = "4";
        while (!(userChoice.equals("0"))) {
            try (Scanner scn = new Scanner(System.in)) {
                userChoice = scn.nextLine();
                if (userChoice.equals("1")) {
                    // TODO: Call add task method here
                    String taskName = scn.nextLine();
                    System.out.println(taskName); // Temporary debug statement
                    list.push(taskName);
                } else if (userChoice.equals("2")) {
                    // TODO: Call delete task method here
                    System.out.println("What task would you like to delete?");
                    String taskName;
                    try (Scanner delScn = new Scanner(System.in)) {
                        taskName = delScn.nextLine();
                    }
                    System.out.println("Task deleted.");
                } else if (userChoice.equals("3")) {
                    // TODO: Call mark task method here
                } else if (userChoice.equals("0")) {
                    System.out.println("Quitting... ");
                }
                list.printList();
            }
        }

        // TODO: Make linked list to store the todo list
    }
}
