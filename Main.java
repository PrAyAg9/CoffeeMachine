import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Mini Project -- DR ANAND MOTWANI -- CSE 2006");
        System.out.println("Welcome to the Coffee Machine, I hope you've a bright coffee day");
        System.out.println("To turn off the machine write:- off");
        Menu menu = new Menu();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        MoneyMachine moneyMachine = new MoneyMachine();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("What would you like? (" + menu.getItems() + "): ");
            String choice = scanner.nextLine();

            if (choice.equals("off")) {
                isRunning = false;
            } else if (choice.equals("report")) {
                coffeeMaker.report();
                moneyMachine.report();
            } else {
                MenuItem drink = menu.findDrink(choice);
                if (drink != null) {
                    if (coffeeMaker.isResourceSufficient(drink)) {
                        if (moneyMachine.makePayment(drink.cost)) {
                            coffeeMaker.makeCoffee(drink);
                            System.out.println("Here is your " + choice + ". Enjoy!");
                        }
                    }
                } else {
                    System.out.println("Sorry, we don't have that drink.");
                }
            }
        }
        scanner.close();
    }
}
