import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class TaskInboxTest {

    @Test
    public void testGetTasksForStudent() {
        TaskInbox inbox = new TaskInbox();
        List<Task> tasks = inbox.getTasksForStudent(1);
        Assert.assertNotNull(tasks);  // Right
        Assert.assertTrue(tasks.isEmpty());  // Initial case, no tasks
    }

    @Test
    public void testViewTask() {
        TaskView taskView = new TaskView();
        TaskDetail taskDetail = taskView.viewTask(1);
        Assert.assertNotNull(taskDetail);  // Right
        Assert.assertNull(taskDetail.getFeedback());  // Initial case, no feedback
        Assert.assertTrue(taskDetail.getChatMessages().isEmpty());  // Initial case, no chat messages
    }
}
