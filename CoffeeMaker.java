public class CoffeeMaker{
    private final int INITIAL_WATER = 300;
    private final int INITIAL_MILK = 200;
    private final int INITIAL_COFFEE = 100;

    private int water;
    private int milk;
    private int coffee;

    public CoffeeMaker(){
        water = INITIAL_WATER;
        milk = INITIAL_MILK;
        coffee = INITIAL_COFFEE;
    }

    public void report() {
        System.out.println("Water: " + water + "ml");
        System.out.println("Milk: " + milk + "ml");
        System.out.println("Coffee: " + coffee + "g");
    }

    public boolean isResourceSufficient(MenuItem drink) {
        for (int i = 0; i < drink.ingredients.length; i++) {
            String ingredient = drink.ingredients[i];
            int amountRequired = drink.amounts[i];

            switch (ingredient) {
                case "water":
                    if (water < amountRequired) {
                        System.out.println("Sorry there is not enough water.");
                        return false;
                    }
                    break;
                case "milk":
                    if (milk < amountRequired) {
                        System.out.println("Sorry there is not enough milk.");
                        return false;
                    }
                    break;
                case "coffee":
                    if (coffee < amountRequired) {
                        System.out.println("Sorry there is not enough coffee.");
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public void makeCoffee(MenuItem drink) {
        for (int i = 0; i < drink.ingredients.length; i++) {
            String ingredient = drink.ingredients[i];
            int amountRequired = drink.amounts[i];

            switch (ingredient) {
                case "water":
                    water -= amountRequired;
                    break;
                case "milk":
                    milk -= amountRequired;
                    break;
                case "coffee":
                    coffee -= amountRequired;
                    break;
            }
        }
    }
}
