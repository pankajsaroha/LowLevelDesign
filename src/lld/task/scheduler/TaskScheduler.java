package lld.task.scheduler;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduler {

    private List<Thread> threads;
    private List<TaskRunner> taskRunners;
    private TaskStore<ScheduleTask> store;

    public TaskScheduler(ExecuteConfig config, TaskStore<ScheduleTask> store){
        this.threads = new ArrayList<>();
        this.taskRunners = new ArrayList<>();
        this.store = store;

        for (int i = 0; i < config.getNumThreads(); i++) {
            TaskRunner taskRunner = new TaskRunner(store);
            Thread thread = new Thread(taskRunner);
            thread.start();
            threads.add(thread);
            taskRunners.add(taskRunner);
        }
    }

    public void stop() {
        taskRunners.forEach(TaskRunner::stop);
        threads.forEach(t -> {
            t.interrupt();
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
}
