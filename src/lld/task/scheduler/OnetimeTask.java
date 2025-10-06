package lld.task.scheduler;

import java.util.Optional;

public class OnetimeTask extends ScheduleTask {

    private final long executionTime;

    public OnetimeTask(String taskId, String taskName, ExecutionContext context, long executionTime) {
        super(taskId, taskName, context);
        this.executionTime = executionTime;
    }

    @Override
    boolean isRecurring() {
        return false;
    }

    @Override
    Optional<ScheduleTask> getNextScheduleTask() {
        return Optional.empty();
    }

    @Override
    long getNextExecutionTime() {
        return executionTime;
    }
}
