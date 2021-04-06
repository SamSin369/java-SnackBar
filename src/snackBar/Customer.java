package snackBar;

public class Customer {
    int maxId = 0;
    int id = 0;
    String name = "";
    double cashOnHand = 0;

    public Customer(String name, double cashOnHand) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;

    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addCash(int cashOnHand) {
        this.cashOnHand += cashOnHand;
    }

    public double getCash() {
        return cashOnHand;
    }

    public void buySnack(int cost) {
        this.cashOnHand -= cost;
    }
}
