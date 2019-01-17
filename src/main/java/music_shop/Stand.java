package music_shop;

import behaviours.ISell;

public class Stand implements ISell {

    private String colour;
    private int costPrice;
    private int salePrice;

    public Stand(String colour, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.costPrice = buyPrice;
        this.salePrice = sellPrice;
    }

    public String getColour() {
        return this.colour;
    }

    public int getBuyPrice() {
        return this.costPrice;
    }

    public int getSellPrice() {
        return this.salePrice;
    }

    public int calculateMarkup() {
        return this.salePrice - this.costPrice;
    }
}
