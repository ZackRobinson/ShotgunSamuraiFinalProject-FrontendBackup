package com.zackeryrobinson.finalprojecttest;

/**
 * Created by ios on 10/17/17.
 */

public class ExpenseRecyclerObject {
    float amount;
    String description;

    public ExpenseRecyclerObject(float amount, String description) {
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
