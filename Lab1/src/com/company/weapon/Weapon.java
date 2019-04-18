package com.company.weapon;

public abstract class Weapon {

    private String name;
    private int weight;
    private int damage;

    public Weapon() {
    }

    public Weapon(String name, int weight, int damage) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
    }

    public abstract void dealDamage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", damage=" + damage +
                '}';
    }
}
