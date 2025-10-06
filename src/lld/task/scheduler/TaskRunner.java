package lld.task.scheduler;

import java.time.Instant;

public class TaskRunner implements Runnable {
    private final TaskStore<ScheduleTask> store;
    private volatile boolean running;

    public TaskRunner (TaskStore<ScheduleTask> store) {
        this.store = store;
        this.running = true;
    }
    @Override
    public void run() {
        while (running && !Thread.currentThread().isInterrupted()) {
            try {
                ScheduleTask task = store.take();
                long delay = task.getNextExecutionTime() - Instant.now().toEpochMilli();
                if (delay > 0) {
                    store.add(task);
                    synchronized (this) {
                        wait(delay);
                    }
                } else {
                    task.execute();
                    if (task.isRecurring()) {
                        store.add(task.getNextScheduleTask().get());
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stop() {
        this.running = false;
        synchronized (this) {
            notify(); //Notify the thread to wake up and stop
        }
    }
}
