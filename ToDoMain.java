import java.io.*;
import java.util.Scanner;


class ToDoMain {

    public static void main(String[] args) {
        System.out.println("What would you like do do?");
        System.out.println("1 = Add Task");
        System.out.println("2 = Delete Task");
        System.out.println("3 = Mark task done/not done");
        System.out.println("0 = Quit");

        int userChoice = 4;
        while (userChoice != 0) {
            try (Scanner scn = new Scanner(System.in)) {
                userChoice = scn.nextLine();
            }
            if (userChoice == 1) {
                // TODO: Call add task method here 
            }
            else if (userChoice == 2) {
                // TODO: Call delete task method here
            }
            else if (userChoice == 3) {
                // TODO: Call mark task method here
            }
            else if (userChoice == 0) {
                System.out.println("Quitting... ");
            }
            else {
                // TODO: Restart loop
            }
        }

        // TODO: Make linked list to store the todo list
    }
}
