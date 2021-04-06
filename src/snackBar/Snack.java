package snackBar;

public class Snack {
    private static int maxId = 1;
    private int id = maxId + 1;
    private String name = "Johhny";
    private int quantity = 15;
    private double cost = 0;
    private int vendingMachineId = 1;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

}
