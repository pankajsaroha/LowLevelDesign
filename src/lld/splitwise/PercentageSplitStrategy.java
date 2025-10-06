package lld.splitwise;

import java.util.List;

public class PercentageSplitStrategy implements SplitStrategy {

    @Override
    public void calculateSplit(List<Split> splits, double amount) {
        for (Split split : splits) {
            PercentageSplit percentageSplit = (PercentageSplit) split;
            percentageSplit.setAmount((amount * percentageSplit.getPercentage()) / 100);
        }
    }
}
