package com.springdependency_injection3.spring_di3;

public class Customer_1 implements DiningHall {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void eatingFood() {

        System.out.println("Customer with id, " + id + " is dining.");

    }

}