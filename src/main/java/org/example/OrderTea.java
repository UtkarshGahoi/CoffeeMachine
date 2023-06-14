package org.example;

public class OrderTea extends  BaverageOrder{
    public Baverage giveOrder() {
        Baverage tea = new Tea();
         tea= new Milk(tea);
        tea = new Sugar(tea);
        return tea;
    }
}
