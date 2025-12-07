package com.library.entity;

public class User {

    private String name;
    private String id;

    // As mentioned in the course - we can use static variables to set counters
    // or use to store database strings or objects or something that needs to be constant
    private static int userCount = 0;

    public User() {
        this("Unknown", "U"+(++userCount)); // used constructor chaining
    }

    public User(String name, String id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "User: "+getName()+" ("+getId()+")";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getUserCount() {
        return userCount;
    }

    public static void setUserCount(int userCount) {
        User.userCount = userCount;
    }
}
