package lld.splitwise;

import java.util.List;

public class ExactSplitStrategy implements SplitStrategy {

    @Override
    public void calculateSplit(List<Split> splits, double amount) {
        if (splits.stream().mapToDouble(s -> ((EqualSplit)s).getAmount()).sum() != 0) {
            throw new IllegalArgumentException("Exact split doesn't sum to " + amount);
        }
        //if want to use method reference, use below
        //splits.stream().map(EqualSplit.class::cast).mapToDouble(EqualSplit::getAmount).sum();
    }
}
