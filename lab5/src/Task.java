
public class Task {
    private int id;
    private int priority;
    private int laboriousness;
    private String description;


    public Task(int id, int priority, int laboriousness, String description) {
        this.id = id;
        this.priority = priority;
        this.laboriousness = laboriousness;
        this.description = description;
    }

    public int getId(){
        return id;
    }
    public int getPriority(){
        return priority;
    }
    public int getLaboriousness(){
        return laboriousness;
    }
    public  String getDescription(){
        return description;
    }

    public void setPriority(int priority){
        this.priority=priority;
    }
}
