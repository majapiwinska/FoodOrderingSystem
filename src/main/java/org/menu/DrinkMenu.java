package org.menu;

import org.meals.Drink;
import org.meals.Meal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkMenu implements Menu {

    private List<Meal> meals = Arrays.asList(new Drink("Mohito", new BigDecimal(16)),
            new Drink("Gin & Tonic", new BigDecimal(15)));

    public List<Meal> getMeals() {
        return meals;
    }
}
