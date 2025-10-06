package lld.task.scheduler;

public class PrintMessageTask implements ExecutionContext{

    private final String message;

    public PrintMessageTask(String message) {
        this.message = message;
    }
    @Override
    public void execute() {
        System.out.println("Task id: " + message + " at " + System.currentTimeMillis());
    }
}
