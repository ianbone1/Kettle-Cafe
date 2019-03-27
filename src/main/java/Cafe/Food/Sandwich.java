package Cafe.Food;

import Cafe.ICanSell;
import Cafe.MenuItem;

public class Sandwich extends MenuItem implements ICanSell {

    private boolean glutenFree;

    public Sandwich(String name, double price, boolean glutenFree) {
        super(name, price);
        this.glutenFree = glutenFree;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public String sell() {
        return "Sold Sandwich";
    }

    public double cost(){
        return this.getPrice();
    }
}
