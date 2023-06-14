package org.example;

public class Sugar extends CondimentDecorator{
    public Sugar(Baverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double getCost() {
        return beverage.getCost() + 0.3;
    }

}
