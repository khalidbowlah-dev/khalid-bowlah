package com.foodordering;

public class User {
    // Protected means "Children" (like com.foodordering.Customer) can use these
    protected String name;
    protected String id;

    // Constructor
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
