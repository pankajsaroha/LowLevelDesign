package lld.splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseService {
    private Map<String, Map<String, Double>> balanceSheet;

    public ExpenseService() {
        this.balanceSheet = new HashMap<>();
    }

    public void addExpense(ExpenseType type, String desc, List<Split> splits, double amount, User paidBy, SplitStrategy strategy) {
        Expense expense = new Expense(desc, amount, splits, strategy);
        User paidTo = paidBy;

        for (Split spilt : splits) {
            User paidFrom = spilt.getUser();
            if (paidTo == paidFrom) continue;

            balanceSheet.computeIfAbsent(paidFrom.getId(), k -> new HashMap<>())
                    .put(paidTo.getId(), balanceSheet.get(paidFrom.getId()).getOrDefault(paidTo.getId(), 0.0) + spilt.getAmount());

            balanceSheet.computeIfAbsent(paidTo.getId(), k -> new HashMap<>())
                    .put(paidFrom.getId(), balanceSheet.get(paidTo).getOrDefault(paidFrom.getId(), 0.0) - spilt.getAmount());
        }
    }

    public void showBalance(User user) {
        Map<String, Double> userBalance = balanceSheet.get(user);

        for (Map.Entry<String, Double> entry : userBalance.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(user.getName() + " owes " + entry.getValue() + " to " + entry.getKey());
            }
        }
    }
}
