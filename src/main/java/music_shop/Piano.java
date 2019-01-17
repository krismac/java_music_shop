package music_shop;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private String manufacturer;
    private int costPrice;
    private int salePrice;

    public Piano(String manufacturer, String colour, int costPrice, int salePrice) {
        super(colour, "Keyboard");
        this.manufacturer = manufacturer;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getManufacturer() {
        return this.manufacturer;
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

    public String play() {
        return "Mooosic";
    }

}
