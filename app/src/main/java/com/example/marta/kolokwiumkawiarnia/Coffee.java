package com.example.marta.kolokwiumkawiarnia;

/**
 * Created by Marta on 17.01.2018.
 */

public class Coffee {

    private String name;
    private String coffePrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffePrice() {
        return coffePrice;
    }

    public void setCoffePrice(String coffePrice) {
        this.coffePrice = coffePrice;
    }

    public Coffee(String name, String coffePrice) {
        this.name = name;
        this.coffePrice = coffePrice;
    }
}
