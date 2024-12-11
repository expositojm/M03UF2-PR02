public class EventTask {
    private String text;
    private boolean isCompleted;

    public EventTask(String text) {
        this.text = text;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public String taskDetails() {
        return "Task: " + text + " - Status: " + (isCompleted ? "Completed" : "Pending");
    }

    // Getters y setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
