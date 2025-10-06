package lld.splitwise;

import java.util.List;
import java.util.UUID;

public class Expense {
    private String id;
    private String desc;
    private double amount;
    private List<Split> splits;
    private SplitStrategy strategy;

    public Expense(String desc, double amount, List<Split> splits, SplitStrategy strategy) {
        this.id = UUID.randomUUID().toString();
        this.desc = desc;
        this.splits = splits;
        this.strategy = strategy;
    }
}
