package org.meals;

import java.math.BigDecimal;

public class MexicanMeal implements Meal {

    private String name;
    private BigDecimal price;

    public MexicanMeal(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
