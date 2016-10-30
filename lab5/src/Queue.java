
public class Queue {
    private Task[] QueueTasks;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди



    public Queue(int maxSize) {
        this.maxSize = maxSize;
        QueueTasks = new Task[maxSize];
        nElem = 0;
    }

    public void insertTaskinQueue(Task elem) {

        if (isEmpty()){
            QueueTasks[nElem] = elem;
            nElem++;
        }
        else{

            int i=0;
            //
            Task[] tempQueue=new Task[maxSize];
            for(int j=0; j<nElem;j++){
                tempQueue[j]=QueueTasks[j];
            }
            //

            while (i<getSize()){
                if (elem.getPriority()<=QueueTasks[i].getPriority()) {
                    i++;
                }
                else break;
            }

            QueueTasks[i]=elem;

            for (; i<nElem; ){
                i++;
                QueueTasks[i]=tempQueue[i-1];
            }
            nElem++;
        }
    }

    public Task removeTheHighestPriorityTask() { //
        Task temp = QueueTasks[0];
        deleteTaskWithIterator(0);
        return temp;
    }

    public Task receiveTheHighestPriorityTaskWithoutDelete(){
        if(!isEmpty()){
            return QueueTasks[0];
        }
        else return null;

    }

    public Task removeTheHighestPriorityTaskWithlaboriousness(int lab) {
        if (!isEmpty()) {
            for (int i = 0; i < nElem; i++) {
                if (QueueTasks[i].getLaboriousness() <= lab) {
                    return QueueTasks[i];
                }
            }
        }
        return null;
    }

    public void deleteTaskById(int id){
        if(!isEmpty()){
            int i;
            for (i = 0; i < nElem; i++) {
                if (QueueTasks[i].getId() == id)
                    break;
            }
            deleteTaskWithIterator(i);
        }
    }

    private void deleteTaskWithIterator(int i){
        //с
        Task[] tempQueue=new Task[maxSize];
        for(int j=0; j<nElem;j++){
            tempQueue[j]=QueueTasks[j];
        }
        //
        nElem--;

        int j=i+1;
        for (;i<nElem;i++, j++){
            QueueTasks[i]=tempQueue[j];
        }
    }

    public Task receiveTaskById(int id){
        if(!isEmpty()){
            int i;
            for (i = 0; i < nElem; i++) {
                if (QueueTasks[i].getId() == id)
                   return QueueTasks[i];
            }

        }
        return null;
    }

    public Task receiveTaskByIdWithDelete(int id){
        if(!isEmpty()){
            int i;
            for (i = 0; i < nElem; i++) {
                if (QueueTasks[i].getId() == id) {
                    deleteTaskWithIterator(i);
                    return QueueTasks[i];
                }
            }

        }
        return null;
    }

    public void changeThePriorityTasks(int id, int priority){
        if(!isEmpty()){
            int i;
            Task temp;
            for (i = 0; i < nElem; i++) {
                if (QueueTasks[i].getId() == id) {
                    QueueTasks[i].setPriority(priority);
                    temp=QueueTasks[i];
                    deleteTaskById(QueueTasks[i].getId());
                    insertTaskinQueue(temp);
                }
            }
        }
    }

    public void deleteAllTasks(){
        QueueTasks=new Task[maxSize];
        nElem=0;
    }


    private boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    private int getSize() {
        return nElem;
    }

}
