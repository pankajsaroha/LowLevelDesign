package lld.splitwise;

public class PercentageSplit extends Split {
    private double percentage;
    private double amount;

    public PercentageSplit(User user, double percentage) {
        super(user);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
