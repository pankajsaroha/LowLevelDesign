package lld.splitwise;

public abstract class Split {
    protected User user;

    public Split(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public abstract double getAmount();
}
