package src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        boolean Open = true;
        String Input = "";
        Scanner scanner = new Scanner(System.in);
        TaskManager tm = TaskManager.getInstance();

        while (Open){
            System.out.println("Choose your action");
            System.out.println("'add' - adds new task");
            System.out.println("'edit' - edit a task");
            System.out.println("'remove' - remove a task");
            System.out.println("'view' - view a task");
            System.out.println("'exit' - close application");
            System.out.println("Enter your action:");
            String action = scanner.nextLine();
            switch (action){
                case "add":
                    System.out.println("~~executed add...");
                    break;

                case "edit":
                    System.out.println("~~executed edit...");
                    break;

                case "remove":
                    System.out.println("~~executed remove...");
                    break;

                case "view":
                    System.out.println("~~executed view...");
                    break;

                case "exit":
                    System.out.println("~~Exiting application...");
                    Open = false;
                    break;

            }

        }
    }
}
