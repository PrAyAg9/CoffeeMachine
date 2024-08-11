class Menu{
    private MenuItem[] menuItems;
    private int itemcount;

    public Menu(){
        menuItems = new MenuItem[3];
        itemcount = 0;

        String[] espressoIngredients = {"water","coffee"};
        int[] espressoAmounts = {50,18};
        menuItems[itemcount++] = new MenuItem("espresso",1.5, espressoIngredients, espressoAmounts);

        String[] latteingredients = {"water", "milk","coffee"};
        int[] latteAmounts = {200,150,24};
        menuItems[itemcount++] = new MenuItem("latte",2.5,latteingredients,latteAmounts);

        String[] cappucinoIngredients = {"water", "milk","coffee"};
        int[] cappucinoAmounts = {250,100,24};
        menuItems[itemcount++] = new MenuItem("cappcino",3.0,cappucinoIngredients,cappucinoAmounts);
    }

//    Using Stringbuilder from here:- This method will simply display name of items from menu;
    public String getItems() {
        StringBuilder items = new StringBuilder();
        for (int i = 0; i < itemcount; i++) {
            if (i > 0) items.append("/");
            items.append(menuItems[i].name);
        }
        return items.toString();
    }

    //     Creating a method called find drink
    public MenuItem findDrink(String orderName) {
        for (MenuItem item : menuItems) {
            if (item.name.equals(orderName)) {
                return item;
            }
        }
        return null;
    }
}
