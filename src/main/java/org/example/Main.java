package org.example;

import java.util.Map;

import static org.example.Inventory.quantityOfIngredients;
import static org.example.Inventory.ut;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(ut);
        Baverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        quantityOfIngredients.put("milk",10);
        quantityOfIngredients.put("sugar",10);
        quantityOfIngredients.put("Coffee",2);

        System.out.println("the ingredients are"+quantityOfIngredients.toString());
        quantityOfIngredients.put("Coffee",0);

        Inventory inventory=new Inventory();
        Map<String, Integer> currentInventory = inventory.findCurrentInventory();
        System.out.println("kdkd"+currentInventory);
        System.out.println("Description: " + coffee.getDescription() + " Cost: " + coffee.getCost());
        String orderType="tea";
        if(orderType.equalsIgnoreCase("TEA")){
           OrderTea orderTea=new OrderTea();
            Baverage baverage = orderTea.giveOrder();
            System.out.println("tea"+baverage.getCost());
        }
    }
}