public class MenuItem {
    String name;
    double cost;
    String[] ingredients;
    int[] amounts;

    public MenuItem(String name, double cost, String[] ingredients,int[] amounts){
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
        this.amounts = amounts;
    }
}
