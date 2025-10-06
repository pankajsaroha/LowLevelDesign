package lld.task.scheduler;

import java.util.Optional;

public abstract class ScheduleTask implements Comparable<ScheduleTask> {
    protected String taskId;
    protected String taskName;
    protected ExecutionContext context;

    public ScheduleTask(String taskId, String taskName, ExecutionContext context) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.context = context;
    }

    abstract boolean isRecurring();

    public void execute() {
        context.execute();
    }

    abstract Optional<ScheduleTask> getNextScheduleTask();
    abstract long getNextExecutionTime();

    @Override
    public int compareTo(ScheduleTask task) {
        return Long.compare(this.getNextExecutionTime(), task.getNextExecutionTime());
    }
}
