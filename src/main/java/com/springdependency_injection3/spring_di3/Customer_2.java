package com.springdependency_injection3.spring_di3;

public class Customer_2 {

    private int id;
    private DiningHall diningHall;

    public void setId(int id) {
        this.id = id;
    }

    public void setDiningHall(DiningHall diningHall) {
        this.diningHall = diningHall;
    }

    public void eatFood() {
        diningHall.eatingFood(id);
    }

}