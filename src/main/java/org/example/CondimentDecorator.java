package org.example;

abstract class CondimentDecorator implements Baverage{
    protected Baverage beverage;

    public CondimentDecorator(Baverage beverage) {
        this.beverage = beverage;
    }
}
