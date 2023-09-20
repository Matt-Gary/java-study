public class Task {
    private String description;
    private boolean check;

    public Task(String description) {
        this.description = description;
        this.check = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isChecked() {
        return check;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", concluida=" + check +
                '}';
    }
}
