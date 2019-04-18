package com.company.weapon;

//Prototype pattern
public class Sword extends Weapon {


    public Sword(){}

    public Sword(String name, int weight, int damage) {
        super(name, weight, damage);
    }

    @Override
    public void dealDamage() {
        System.out.println("Deal damage with sword");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Sword(this.getName(),this.getWeight(), this.getDamage());
    }
}
