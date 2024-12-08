package Java_Training_MidWeekProject_CSMS.menu;

public class MenuItem {
    private String name;
    private double price;
    private int itemID;

    public MenuItem(String name, double price, int itemID) {
        this.name = name;
        this.price = price;
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getItemID() {
        return itemID;
    }

    @Override
    public String toString() {
        return "MenuItem [name=" + name + ", price=" + price + ", itemID=" + itemID + "]";
    }
}
