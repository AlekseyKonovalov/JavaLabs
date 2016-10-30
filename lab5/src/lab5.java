

public class lab5 {
    public static void main(String[] args) {

        Queue myQueue = new Queue(10);


        Task tempTask=new Task(1, 4, 6, "end");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(2, 6, 16, "end2");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(3, 2, 26, "end3");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(4, 8, 3, "end4");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(5, 7, 22, "end5");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(6, 2, 13, "end6");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(7, 10, 24, "end7");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(8, 3, 8, "end8");
        myQueue.insertTaskinQueue(tempTask);
        tempTask=new Task(9, 8, 1, "end9");
        myQueue.insertTaskinQueue(tempTask);

        Task temp=myQueue.removeTheHighestPriorityTaskWithlaboriousness(12);
        System.out.println("id: " +  temp.getId()+ " pr " + temp.getPriority());
        temp=myQueue.receiveTheHighestPriorityTaskWithoutDelete();
        System.out.println("id: " +  temp.getId()+ " pr " +temp.getPriority());

        myQueue.deleteTaskById(6);

        System.out.println("_____________");

        while (!myQueue.isEmpty()) {
            temp= myQueue.removeTheHighestPriorityTask();
            System.out.println("id: " + temp.getId() + " pr  " + temp.getPriority());
        }

    }

}
