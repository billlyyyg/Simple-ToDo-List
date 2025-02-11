package src;

import java.util.Scanner;

public class Application {
    private static TaskManager tm;

    public static void main(String[] args){
        boolean Open = true;
        String Input = "";
        Scanner scanner = new Scanner(System.in);
        tm = TaskManager.getInstance();

        while (Open){
            System.out.println("Choose your action");
            System.out.println("'add' - adds new task");
            System.out.println("'view' - view tasks");
            System.out.println("'exit' - close application");
            System.out.println("Enter your action:");
            String action = scanner.nextLine();
            switch (action){
                case "add":
                    newTask(scanner);
                    break;

                case "view":
                    tm.printTasks();
                    break;

                case "exit":
                    System.out.println("~~Exiting application...");
                    Open = false;
                    break;

            }

        }
    }

    public static void newTask(Scanner scanner){
        Task t = new Task();
        System.out.println("Enter Name:");
        t.setName(scanner.nextLine());
        System.out.println("Enter Description:");
        t.setDescription(scanner.nextLine());
        tm.add(t);
    }
}
