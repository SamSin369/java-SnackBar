package snackBar;

public class VendingMachine {
    int maxId = 0;
    int id;
    String name;

    public VendingMachine(String name) {
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
