package SnackBar;

public class Main {

    private static void homework () {
        Customer jane = new Customer("Jane", 45.25);

        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");

        VendingMachine drink = new VendingMachine("Drink");

        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());

        Snack chocolate_bar = new Snack("Chocolate Bar", 36, 1.00, food.getId());

        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());

        Snack water = new Snack("Water", 20, 2.75, drink.getId());


        System.out.println(jane);
        System.out.println(bob);
        System.out.println(food);
        System.out.println(drink);
        System.out.println(office);
        System.out.println(chips);
        System.out.println(chocolate_bar);
        System.out.println(pretzel);
        System.out.println(soda);
        System.out.println(water);
    }

    public static void main(String[] args) {
        homework();
    }

}