package src;

import java.util.ArrayList;

public class PriorityQueue {
    ArrayList<Task> queue;

    PriorityQueue(){
        queue = new ArrayList<Task>();
    }
    public void add(Task task){
        int pos = 0;
        for (int i = 0; i < queue.size(); i++){
            if (task.getUrgency() < queue.get(i).getUrgency()){
                pos +=1;
            } else {
                break;
            }
        }
        queue.add(pos, task);
    }

    public void remove(int i){
        queue.remove(i);
    }

    public Task poll(){
        if (queue.size() == 0){
            return null;
        }
        Task task = queue.get(0);
        queue.remove(0);
        return task;
    }
    public Task get(int num){
        return queue.get(num);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }
}
