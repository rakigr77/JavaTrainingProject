package Java_TrainingProject_CSMS_Advance;

public class SpecialtyItem extends MenuItem {
    private double discount; // Discount percentage

    // Constructor
    public SpecialtyItem(String name, double price, int itemID, double discount) {
        super(name, price, itemID);
        this.discount = discount;
    }

    // Getter and Setter methods
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Calculate discounted price
    public double getDiscountedPrice() {
        return getPrice() * (1 - discount / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " [Discount=" + discount + "%, Discounted Price=$" + getDiscountedPrice() + "]";
    }
}


