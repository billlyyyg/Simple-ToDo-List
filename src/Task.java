package src;

public class Task {
    private String name;
    private String description;
    private int urgency;

    Task(){

    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setUrgency(int urgency){
        this.urgency = urgency;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getUrgency(){
        return this.urgency;
    }
}
