package com.company.soldier;


//Prototype pattern
public class Infantry extends Soldier {


    public Infantry() {
    }

    public Infantry(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void fight() {
        System.out.println("Fight in Infantry");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Infantry(this.getName(),this.getHealth(), this.getDamage());
    }
}
