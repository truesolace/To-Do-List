public class Task {

    public Task(String tmpName) {
        this.name = tmpName;
    }

    public void setName(String tmpName) {
        this.name = tmpName;
    }

    public void setIsComplete(boolean completion) {
        this.isComplete = completion;
    }

    public String getName() {
        return this.name;
    }

    public boolean getCompletion() {
        return this.isComplete;
    }

    private String name;
    private boolean isComplete;
}
