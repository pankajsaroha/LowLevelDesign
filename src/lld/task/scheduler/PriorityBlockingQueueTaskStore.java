package lld.task.scheduler;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTaskStore implements TaskStore<ScheduleTask> {
    private final PriorityBlockingQueue<ScheduleTask> queue;
    private final Set<ScheduleTask> tasks;

    public PriorityBlockingQueueTaskStore(Comparator<ScheduleTask> comparator, int capacity) {
        this.queue = new PriorityBlockingQueue<>();
        this.tasks = new HashSet<>();
    }

    @Override
    public ScheduleTask peek() {
        return queue.peek();
    }

    @Override
    public ScheduleTask poll() {
        return queue.poll();
    }

    @Override
    public ScheduleTask take() throws InterruptedException {
        return queue.take();
    }

    @Override
    public void add(ScheduleTask task) {
        queue.add(task);
    }

    @Override
    public boolean remove(ScheduleTask task) {
        return queue.remove(task);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
