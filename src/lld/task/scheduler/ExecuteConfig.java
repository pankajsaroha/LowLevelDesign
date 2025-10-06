package lld.task.scheduler;

public class ExecuteConfig {
    private int numThreads;

    public ExecuteConfig(int numThreads) {
        this.numThreads = numThreads;
    }

    public int getNumThreads() {
        return numThreads;
    }

    public void setNumThreads(int numThreads) {
        this.numThreads = numThreads;
    }
}
