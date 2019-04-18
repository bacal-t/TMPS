package com.company.soldier;

//Prototype pattern
public class Cavalry extends Soldier {

    public Cavalry() {
    }

    public Cavalry(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void fight() {
        System.out.println("Fight in Cavalry");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Cavalry(this.getName(),this.getHealth(), this.getDamage());
    }
}
