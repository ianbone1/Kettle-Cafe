package Cafe.Drink;

import Cafe.ICanSell;
import Cafe.MenuItem;

public class Drink extends MenuItem implements ICanSell {

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
