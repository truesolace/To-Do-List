import java.io.*;
import java.util.Scanner;


class ToDoMain {

    public static void main(String[] args) {
        System.out.println("What would you like do do?");
        System.out.println("1 = Add Task");
        System.out.println("2 = Delete Task");
        System.out.println("3 = Mark task done/not done");

        int userChoice = 4;
        try (Scanner scn = new Scanner(System.in)) {
            taskName = scn.nextLine();
        }
        // TODO: Make linked list to store the todo list
    }
}
