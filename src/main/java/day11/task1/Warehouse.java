package day11.task1;

public class Warehouse {
    private int countOrder = 0;
    private int balance = 0;

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
