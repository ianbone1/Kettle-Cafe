package Cafe.Food;

import Cafe.ICanBuy;
import Cafe.MenuItem;

public class Sandwich extends MenuItem implements ICanBuy {

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
