package org.menu;

import org.meals.Drink;
import org.meals.Meal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DrinkMenu implements Menu {

    Meal drink1 = new Drink("Mohito", new BigDecimal(16));
    Meal drink2 = new Drink("Gin & Tonic", new BigDecimal(15));

    public List<Meal> getMeals() {
        List<Meal> drinks = new ArrayList<>();
        drinks.add(drink1);
        drinks.add(drink2);
        return drinks;
    }
}
