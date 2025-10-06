package lld.task.scheduler;

import java.time.Instant;
import java.util.Comparator;

public class TaskSchedulerApp {

    public static void main(String[] args) throws InterruptedException {
        Comparator<ScheduleTask> comparator = Comparator.comparingLong(ScheduleTask::getNextExecutionTime);

        //create priority queue with comparator and capacity of 10
        TaskStore<ScheduleTask> store = new PriorityBlockingQueueTaskStore(comparator, 10);

        //configuring scheduler with 2 threads
        ExecuteConfig config = new ExecuteConfig(2);
        TaskScheduler scheduler = new TaskScheduler(config, store);

        //create one time task executes after 3 seconds
        long onetimeTaskExecutionTime = Instant.now().toEpochMilli() + 3000;
        ScheduleTask onetimeTask = new OnetimeTask("onetime-task-1", "Print message one time", new PrintMessageTask("One time task executed"), onetimeTaskExecutionTime);

        store.add(onetimeTask);

        //create recurring task (executes after 2 seconds, then every 5 seconds)
        long recurringTaskExecutionTime = Instant.now().toEpochMilli() + 2000;
        ScheduleTask recurringTask = new RecurringTask("recurring-task-1", "Print message recurring", new PrintMessageTask("Recurring task executed"), recurringTaskExecutionTime, 5000);

        store.add(recurringTask);

        Thread.sleep(20000);
        scheduler.stop();
        System.out.println("Scheduler stopped.");
    }
}
