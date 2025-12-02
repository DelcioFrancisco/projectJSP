package model;

import lombok.Getter;

import java.util.Random;

public class User {
    @Getter
    private int id;
    @Getter
    private String name;
    private String responsibilityId;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.responsibilityId = responsibilityId;
    }

    public int getResponsibilityId() {
        return getRandomIntMath(1, 10); }

    public static int getRandomIntMath(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

}
