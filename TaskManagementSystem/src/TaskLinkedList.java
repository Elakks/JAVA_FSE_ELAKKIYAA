public class TaskLinkedList {
    private Task head;

    public TaskLinkedList() {
        this.head = null;
    }

    public void addTask(Task newTask) {
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
    }

    public Task searchTask(String taskId) {
        Task current = head;
        while (current != null) {
            if (current.getTaskId().equals(taskId)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteTask(String taskId) {
        if (head == null) {
            return;
        }

        if (head.getTaskId().equals(taskId)) {
            head = head.getNext();
            return;
        }

        Task current = head;
        Task previous = null;
        while (current != null && !current.getTaskId().equals(taskId)) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            previous.setNext(current.getNext());
        }
    }

    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
