package org.menu;

import org.meals.Meal;
import org.meals.MexicanMeal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanMenu implements Menu {

    private List<Meal> meals = Arrays.asList(new MexicanMeal("Burito", new BigDecimal(16)),
            new MexicanMeal("Quesadilla", new BigDecimal(18)));

    public List<Meal> getMeals() {
        return meals;
    }
}
