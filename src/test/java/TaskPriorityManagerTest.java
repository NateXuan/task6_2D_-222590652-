import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;

public class TaskPriorityManagerTest {

    @Test
    public void testSetTaskPriority() {
        Task task1 = new Task(1, "Task 1", "Description 1");
        Task task2 = new Task(2, "Task 2", "Description 2");
        List<Task> tasks = Arrays.asList(task1, task2);

        TaskPriorityManager manager = new TaskPriorityManager(tasks);
        manager.setTaskPriority(1, 1);
        Assert.assertEquals(1, task1.getPriority());  // Right

        manager.setTaskPriority(2, 2);
        Assert.assertEquals(2, task2.getPriority());  // Right
    }

    @Test
    public void testGetTasksByPriority() {
        Task task1 = new Task(1, "Task 1", "Description 1");
        Task task2 = new Task(2, "Task 2", "Description 2");
        Task task3 = new Task(3, "Task 3", "Description 3");
        task1.setPriority(3); // Low
        task2.setPriority(1); // High
        task3.setPriority(2); // Medium
        List<Task> tasks = Arrays.asList(task1, task2, task3);

        TaskPriorityManager manager = new TaskPriorityManager(tasks);
        List<Task> sortedTasks = manager.getTasksByPriority();

        Assert.assertEquals(3, sortedTasks.size());  // Right
        Assert.assertEquals(1, sortedTasks.get(0).getPriority());  // High
        Assert.assertEquals(2, sortedTasks.get(1).getPriority());  // Medium
        Assert.assertEquals(3, sortedTasks.get(2).getPriority());  // Low
    }

    @Test
    public void testInvalidPriority() {
        Task task = new Task(1, "Task 1", "Description 1");
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            task.setPriority(0);  // Error
        });
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            task.setPriority(4);  // Error
        });
    }
}