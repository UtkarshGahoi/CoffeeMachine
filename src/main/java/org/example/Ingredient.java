package org.example;

import java.util.HashMap;
import java.util.Map;

public class Ingredient {
    String name;
    Double quantity;

    private Map<String,Double>quantityOfIngredient=new HashMap<>();


    public Ingredient(String name, Double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public void  addQuantityForIngredient(Ingredient ingredient){
        quantityOfIngredient.put(ingredient.getName(),ingredient.getQuantity());
    }
    public Map<String,Double>getQuantityOfIngredient(){
        return  quantityOfIngredient;
    }

}
