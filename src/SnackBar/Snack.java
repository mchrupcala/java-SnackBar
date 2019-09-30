package SnackBar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vending_machine_id;

    public Snack(String name, int quantity, double cost, int vending_machine_id) {
        maxId++;
        id = maxId;
        
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vending_machine_id = vending_machine_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    //Add quantity when given how many to add.


    //Buy snack when given how many to buy.


    public void setQuantity(int quantity) {
         quantity = this.quantity + quantity;
    }

    public double getCost() {
        return cost;
    }

    //get total cost given a quantity.

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vending_machine_id;
    }

    public void setVendingMachineId(int vending_machine_id) {
        this.vending_machine_id = vending_machine_id;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" +
        "Name: " + name + "\n" +
        "quantity: " + quantity + "\n" +
        "cost: " + cost + "\n" +
        "vending ID: " + vending_machine_id;
        return rtnStr;
    }

}