package lld.splitwise;

import java.util.List;

public class ExpenseFactory {

    public static Expense createExpense(ExpenseType type, String desc, double amount, List<Split> splits) {
        SplitStrategy strategy = switch (type) {
            case EQUAL -> new EqualSplitStrategy();
            case EXACT -> new ExactSplitStrategy();
            case PERCENTAGE -> new PercentageSplitStrategy();
        };
        return new Expense(desc, amount, splits, strategy);
    }
}
