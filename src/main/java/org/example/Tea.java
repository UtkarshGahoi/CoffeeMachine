package org.example;

public class Tea implements Baverage{
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
