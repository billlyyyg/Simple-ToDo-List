package src;

import java.util.ArrayList;

public class TaskManager {
    private static TaskManager instance;

    private ArrayList<Task> tasks;

    private TaskManager(){
        tasks = new ArrayList<Task>();
    }

    public static TaskManager getInstance(){
        if (instance == null){
            instance = new TaskManager();
        }
        return instance;
    }

    public void add(){

    }
}
