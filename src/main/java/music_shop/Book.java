package music_shop;

import behaviours.ISell;

public class Book implements ISell {
    String name;
    int costPrice;
    int salePrice;

    public Book(String name, int costPrice, int salePrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return this.name;
    }

    public int getCostPrice() {
        return this.costPrice;
    }

    public int getSalePrice() {
        return this.salePrice;
    }

    public int calculateMarkup() {
        return this.salePrice - this.costPrice;
    }

}
