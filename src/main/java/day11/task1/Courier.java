package day11.task1;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void bonus() {
    if (warehouse.getBalance() > 1000000)
        salary = salary * 2;
    }
    @Override
    public void doWork(){
        salary += 100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
