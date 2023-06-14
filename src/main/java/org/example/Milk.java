package org.example;

public class Milk extends CondimentDecorator{
    public Milk(Baverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
