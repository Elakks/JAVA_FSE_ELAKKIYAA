public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task("T001", "Design UI", "In Progress"));
        taskList.addTask(new Task("T002", "Develop Backend", "Not Started"));
        taskList.addTask(new Task("T003", "Testing", "Not Started"));

        // Traverse tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearch for Task ID T002:");
        Task foundTask = taskList.searchTask("T002");
        System.out.println(foundTask != null ? foundTask : "Task not found");

        // Delete a task
        System.out.println("\nDeleting Task ID T001");
        taskList.deleteTask("T001");

        // Traverse tasks after deletion
        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
