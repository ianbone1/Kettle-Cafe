package Cafe.Drink;

import Cafe.ICanBuy;
import Cafe.MenuItem;

public class Drink extends MenuItem implements ICanBuy {

    private boolean containsAlcohol;

    public Drink(String name, double price, boolean containsAlcohol) {
        super(name, price);
        this.containsAlcohol = containsAlcohol;
    }

    public boolean containsAlcohol() {
        return this.containsAlcohol;
    }

    public String sell() {
        return "Sold Drink";
    }

    public double cost(){
        return this.getPrice();
    }
}
