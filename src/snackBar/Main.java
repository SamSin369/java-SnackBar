package snackBar;

public class Main {
    public static void main(String[] args) {
        Snack snackOne = new Snack("Sam", 10, 15, 10);
        Customer firstCustomer = new Customer("Jane", 45.25);
        Customer secondCustomer = new Customer("Bob", 33.14);
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        Snack snacktwo = new Snack("Chips", 36, 1.00, 1);
        Snack snackthree = new Snack("Chocalate", 36, 1.00, 1);
        Snack snackfour = new Snack("Pretzels", 30, 2.00, 1);
        Snack snackfive = new Snack("Soda", 30, 2.50, 2);
        Snack snacksix = new Snack("Water", 30, 2.75, 2);
        System.out.println("Jane's cash on hand is " + firstCustomer.getCash());
        System.out.println("Quantity of soda is " + snackfive.getQuantity());
        System.out.println(
                "Janes cash on hand after a pretzel is bought " + (firstCustomer.getCash() - snackfour.getCost()));
    }

}
