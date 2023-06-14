package org.example;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public static String ut="js";

    public static Map<String, Integer> quantityOfIngredients=new HashMap<>();

    public Map<String,Integer> findCurrentInventory(){
        return quantityOfIngredients;
    }


}
