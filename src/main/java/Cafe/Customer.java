package Cafe;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private double money;
    private ArrayList<ICanBuy> purchases;

    public Customer(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.purchases = new ArrayList<ICanBuy>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public boolean debit(double price){
        if (this.money>=price){
            this.money-= price;
            return true;
        }
        return false;
    }

    public boolean buy(ICanBuy menuItem){
        if (this.debit(menuItem.cost())){
            this.purchases.add(menuItem);
            return true;
        }
        return false;
    }

    public int purchaseCount(){
        return this.purchases.size();
    }


}
