package Java_Training_MidWeekProject_CSMS.menu;

public class SpecialtyItem extends MenuItem {
    private double discount;

    public SpecialtyItem(String name, double price, int itemID, double discount) {
        super(name, price, itemID);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return super.toString() + " (Specialty Item: Discount=" + discount + "%)";
    }
}

