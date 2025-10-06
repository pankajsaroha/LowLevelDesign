package lld.splitwise;

public class EqualSplit extends Split {
    private double amount;

    public EqualSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
