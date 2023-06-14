package org.example;

public class OrderCoffee extends BaverageOrder{
    public Baverage giveOrder() {
        Baverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);
        return coffee;
    }

}
