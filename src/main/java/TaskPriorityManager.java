import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskPriorityManager {
    private List<Task> tasks;

    public TaskPriorityManager(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setTaskPriority(int taskId, int priority) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setPriority(priority);
                break;
            }
        }
    }

    public List<Task> getTasksByPriority() {
        return tasks.stream()
            .sorted(Comparator.comparingInt(Task::getPriority))
            .collect(Collectors.toList());
    }
}
