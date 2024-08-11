class MoneyMachine {
    private double profit;

    public MoneyMachine() {
        this.profit = 0;
    }

    public void report() {
        System.out.println("Money: Rs." + String.format("%.2f", profit));
    }

    public boolean makePayment(double cost) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert coins.");
        System.out.print("500Rs:- : ");
        int quarters = scanner.nextInt();
        System.out.print("100Rs:- : ");
        int dimes = scanner.nextInt();
        System.out.print("50Rs:- ");
        int nickles = scanner.nextInt();
        System.out.print("10Rs:- ");
        int pennies = scanner.nextInt();

        double total = quarters * 500 + dimes * 100 + nickles * 50 + pennies * 10;
        if (total < cost) {
            System.out.println("Sorry that's not enough money. Money refunded.");
            return false;
        } else {
            if (total > cost) {
                double change = total - cost;
                System.out.println("Here is Rs." + String.format("%.2f", change) + " Ruppess in change.");
            }
            profit += cost;
            return true;
        }
    }
}
