public class MoneyMachine {
    private double profit;

    public MoneyMachine() {
        this.profit = 0;
    }

    public void report() {
        System.out.println("Money: $" + String.format("%.2f", profit));
    }

    public boolean makePayment(double cost) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert coins.");
        System.out.print("Quarters: ");
        int quarters = scanner.nextInt();
        System.out.print("Dimes: ");
        int dimes = scanner.nextInt();
        System.out.print("Nickles: ");
        int nickles = scanner.nextInt();
        System.out.print("Pennies: ");
        int pennies = scanner.nextInt();

        double total = quarters * 0.25 + dimes * 0.10 + nickles * 0.05 + pennies * 0.01;
        if (total < cost) {
            System.out.println("Sorry that's not enough money. Money refunded.");
            return false;
        } else {
            if (total > cost) {
                double change = total - cost;
                System.out.println("Here is $" + String.format("%.2f", change) + " dollars in change.");
            }
            profit += cost;
            return true;
        }
    }
}
