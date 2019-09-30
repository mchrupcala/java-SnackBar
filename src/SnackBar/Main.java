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


        jane.buySnack(3, 7.50);
        soda.buySnack(3, 7.50);
        System.out.println("Jane just bought 3 sodas! " + jane.getName() + " cash on hand: " + jane.getCash() + ". Remaining sodas: " + soda.getQuantity());

        jane.buySnack(1, 2.00);
        pretzel.buySnack(1, 2.00);
        System.out.println("Jane just bought 1 pretzel! " + jane.getName() + " cash on hand: " + jane.getCash() + ". Remaining pretzels: " + pretzel.getQuantity());

        bob.buySnack(2, 5);
        soda.buySnack(2, 5);
        System.out.println("Bob just bought 2 sodas! " + bob.getName() + " cash on hand: " + bob.getCash() + ". Remaining sodas: " + soda.getQuantity());

        jane.addCash(10);
        System.out.println("Jane found 10 bucks. " + jane.getName() + " cash on hand: " + jane.getCash());

        jane.buySnack(1, 2);
        chocolate_bar.buySnack(1, 2);
        System.out.println("Jane just bought 1 chocolate bar! " + jane.getName() + " cash on hand: " + jane.getCash() + ". Remaining chocolate bars: " + chocolate_bar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println("12 pretzels added to the machine. " + "Remaining number of pretzels: " + pretzel.getQuantity());

        bob.buySnack(3, 6.00);
        soda.buySnack(3, 6.00);
        System.out.println("Bob just bought 3 sodas! " + bob.getName() + " cash on hand: " + bob.getCash() + ". Remaining pretzels: " + pretzel.getQuantity());

        System.out.println("**LIST OF ALL SNACKS**");

        System.out.println(chips.toString());
        System.out.println(chocolate_bar.toString());
        System.out.println(pretzel.toString());
        System.out.println(soda.toString());
        System.out.println(water.toString());
    }

    public static void main(String[] args) {
        homework();
    }

}