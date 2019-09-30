package SnackBar;

class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }


    //Buy given total cash used in purchase.
    public void buySnack(int buyQuantity, double totalCash) {
        cash = this.cash - totalCash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(double newCash) {
        cash = this.cash + newCash; 
    }


}