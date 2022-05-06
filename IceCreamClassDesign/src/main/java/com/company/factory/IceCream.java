package com.company.factory;

import java.util.List;

public class IceCream {
    private String flavor;
    private double salePrice;
    private List<String> ingredients;

    public IceCream(String flavor, double salePrice, List<String> ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.ingredients = ingredients;
    }


    public void raisePrices() {
        this.salePrice = this.salePrice + 5;
    }

    public void salesPitch() {
        System.out.println("Howdy, we currently have " + flavor + " Ice Cream on sale for " + salePrice + "!");
    }

    public double priceWithTax(double taxrate) {
        return salePrice + (salePrice * taxrate);
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", ingredients=" + ingredients +
                '}';
    }
}
