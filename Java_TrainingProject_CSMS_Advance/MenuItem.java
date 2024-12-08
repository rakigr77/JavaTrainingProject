package Java_TrainingProject_CSMS_Advance;

public class MenuItem {
    private String name;
    private double price;
    private int itemID;

    // Constructor
    public MenuItem(String name, double price, int itemID) {
        this.name = name;
        this.price = price;
        this.itemID = itemID;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "MenuItem [ID=" + itemID + ", Name=" + name + ", Price=$" + price + "]";
    }
}

