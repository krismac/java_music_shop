package music_shop;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String model;
    private int numberOfStrings;
    private int costPrice;
    private int salePrice;

    public Guitar(String model, String colour, int numberOfStrings, int costPrice, int retailPrice) {
        super(colour, "String");
        this.numberOfStrings = numberOfStrings;
        this.model = model;
        this.costPrice = costPrice;
        this.salePrice = retailPrice;
    }

    public String play() {
        return "Strum";
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
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
