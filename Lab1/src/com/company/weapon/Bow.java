package com.company.weapon;

//Prototype pattern
public class Bow extends Weapon {

    public Bow() {
    }

    public Bow(String name, int weight, int damage) {
        super(name, weight, damage);
    }

    @Override
    public void dealDamage() {
        System.out.println("Deal damage with Bow");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Bow(this.getName(),this.getWeight(), this.getDamage());
    }
}
