package org;

import org.meals.Meal;

import java.util.List;

public class Order {

    private List<Meal> meals;

    public Order() {}

    public Order(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }
}
