import java.util.ArrayList;
import java.util.List;

public class TaskDetail {
	private int taskId;
    private String feedback;
    private List<String> chatMessages;

    public TaskDetail() {
        this.chatMessages = new ArrayList<>();
    }

    public int getTaskId() {
        return taskId;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<String> getChatMessages() {
        return chatMessages;
    }
}
