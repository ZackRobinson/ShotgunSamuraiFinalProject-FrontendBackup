package com.zackeryrobinson.finalprojecttest;

/**
 * Created by Admin on 10/17/2017.
 */

public class RequestAdvanceClass {
    float amount;
    String description;

    public RequestAdvanceClass(float amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
