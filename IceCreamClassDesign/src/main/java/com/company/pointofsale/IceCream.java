package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }


    public double sellIceCream(int howMany) {
        this.quantity = quantity - howMany;
        return howMany * price;
    }

    public double priceWithTax(double taxrate) {
        return price + (price * taxrate);
    }

    public void salesPitch() {
        System.out.println("Howdy, we currently have " + flavor + " Ice Cream on sale for " + price + "!");
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
