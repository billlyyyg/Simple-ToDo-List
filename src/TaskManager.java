package src;

import java.util.ArrayList;

public class TaskManager {
    private static TaskManager instance;

    private PriorityQueue tasks;

    private TaskManager(){
        tasks = new PriorityQueue();
    }

    public static TaskManager getInstance(){
        if (instance == null){
            instance = new TaskManager();
        }
        return instance;
    }

    public void add(Task task){
        tasks.add(task);
    }
    public Task poll(){
        return tasks.poll();
    }

    public void printTasks(){
        for (int i = 0; i < tasks.size(); i++){
            Task t = tasks.get(i);
            System.out.println(t.getName() +  ": " + t.getDescription());
        }
    }

}
