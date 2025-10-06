package lld.splitwise;

import java.util.List;

public class EqualSplitStrategy implements SplitStrategy {
    @Override
    public void calculateSplit(List<Split> splits, double amount) {
        double share = amount / splits.size();
        for (Split split : splits) {
            if (split instanceof EqualSplit) {
                ((EqualSplit) split).setAmount(share);
            }
        }
    }
}
