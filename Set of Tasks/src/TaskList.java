import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> setOfTask;

    public TaskList() {
        this.setOfTask = new HashSet<>();
    }

    public void addTask(String description) {
        setOfTask.add(new Task(description));
    }

    public void removeTask(String description) {
        Task taskForRemove = null;
        if (!setOfTask.isEmpty()) {
            for (Task t : setOfTask) {
                if (t.getDescription().equalsIgnoreCase(description)) {
                    taskForRemove = t;
                    break;
                }
            }
            setOfTask.remove(taskForRemove);
        } else {
            System.out.println("Task not found!");
        }
    }

    public void showTasks() {
        if (!setOfTask.isEmpty()) {
            System.out.println(setOfTask);
        } else {
            System.out.println("Task not found!");
        }
    }

    public int amountTask() {
        return setOfTask.size();
    }

    public Set<Task> getConcludeTasks() {
        Set<Task> concludeTask = new HashSet<>();
        for (Task t : setOfTask) {
            if (t.isChecked()) {
                concludeTask.add(t);
            }
        }
        return concludeTask;
    }

    public void markConcludeTask(String description) {
        for (Task t : setOfTask) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setCheck(true);
            }
        }
    }

    public Set<Task> getPendingTasks() {
        Set<Task> tasksNotFinished = new HashSet<>();
        for (Task t : setOfTask) {
            if (!t.isChecked()) {
                tasksNotFinished.add(t);
            }
        }
        return tasksNotFinished;
    }
    public void markAsPending(String description) {
        Task pendingTask = null;
        for (Task t : setOfTask) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                pendingTask = t;
                break;
            }
        }

        if (pendingTask != null) {
            if (pendingTask.isChecked()) {
                pendingTask.setCheck(false);
            }
        } else {
            System.out.println("Task not found!");
        }
    }

    public void cleanTasks() {
        if (setOfTask.isEmpty()) {
            System.out.println("There aren't already any tasks");
        } else {
            setOfTask.clear();
        }
    }
    
    public static void main(String[] args) {
        // Create new instance of TaskList class
        TaskList listTask = new TaskList();

        // Add tasks to a list
        listTask.addTask("Study Java");
        listTask.addTask("Make exercises");
        listTask.addTask("Organize study desk");
        listTask.addTask("Read book");
        listTask.addTask("Make a presentation");

        // Display our list of tasks
        listTask.showTasks();

        // Removendo uma tarefa
        listTask.removeTask("Make exercises");
        listTask.showTasks();

        // Count number of tasks
        System.out.println("Total amount of tasks: " + listTask.amountTask());

        // Get pending task
        System.out.println(listTask.getPendingTasks());

        // Mark task as checked
        listTask.markConcludeTask("Read book");
        listTask.markConcludeTask("Study Java");

        // get checked tasks
        System.out.println(listTask.getPendingTasks());

        // mark tasks as pending
        listTask.markAsPending("Study Java");
        listTask.showTasks();

        // Clear list of tasks
        listTask.cleanTasks();
        listTask.showTasks();
    }
}
    

