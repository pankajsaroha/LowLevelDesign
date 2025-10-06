package lld.task.scheduler;

import java.util.Optional;

public class RecurringTask extends ScheduleTask {

    private final long executionTime;
    private final long interval;

    public RecurringTask(String taskId, String taskName, ExecutionContext context, long executionTime, long interval) {
        super(taskId, taskName, context);
        this.executionTime = executionTime;
        this.interval = interval;
    }

    @Override
    boolean isRecurring() {
        return true;
    }

    @Override
    Optional<ScheduleTask> getNextScheduleTask() {
        return Optional.of(new RecurringTask(taskId, taskName, context, executionTime + interval, interval));
    }

    @Override
    long getNextExecutionTime() {
        return executionTime;
    }
}
