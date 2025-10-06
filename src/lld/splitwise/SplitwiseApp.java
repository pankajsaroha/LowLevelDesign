package lld.splitwise;

import java.util.Arrays;

public class SplitwiseApp {

    public static void main(String[] args) {
        User u1 = new User("u1", "Vishu");
        User u2 = new User("u2", "Paras");
        User u3 = new User("u3", "Anchal");

        ExpenseService service = new ExpenseService();
        service.addExpense(ExpenseType.EQUAL, "Lunch", Arrays.asList(), 300, u1, new EqualSplitStrategy());
    }
}
