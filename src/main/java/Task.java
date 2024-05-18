
public class Task {
    private int id;
    private String title;
    private String description;
    private int priority; // 1-high，2-medium，3-low

    // Constructors, getters and setters
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = 3; 
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority < 1 || priority > 3) {
            throw new IllegalArgumentException("Priority must be between 1 and 3");
        }
        this.priority = priority;
    }
}
