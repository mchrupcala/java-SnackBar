package SnackBar;

public class Snack {
    private int id;
    public String name;
    public String quantity;
    public double cost;
    private int vending_machine_id;

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

    public double getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vending_machine_id;
    }

    public void setVendingMachineId(String vending_machine_id) {
        this.vending_machine_id = vending_machine_id;
    }

}