package org.meals;

import java.math.BigDecimal;

public class Drink implements Meal {

    private final String name;
    private final BigDecimal price;
    private boolean lemon;
    private boolean ice;

    public Drink(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isLemon() {
        return lemon;
    }

    public void setLemon(boolean lemon) {
        this.lemon = lemon;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }
}
