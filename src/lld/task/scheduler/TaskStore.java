package lld.task.scheduler;

public interface TaskStore<T extends ScheduleTask> {
    T peek();
    T poll();
    T take() throws InterruptedException;
    void add(ScheduleTask task);
    boolean remove(ScheduleTask task);
    boolean isEmpty();
}
