package com.company.army;

import com.company.soldier.Soldier;
import com.company.weapon.Weapon;

import java.util.List;


//Builder pattern
public class Army {


    private String name;
    private List<Soldier> soldiers;
    private List<Weapon> weapons;

    private Army(ArmyBuilder armyBuilder){
        this.name = armyBuilder.name;
        this.soldiers = armyBuilder.soldiers;
        this.weapons = armyBuilder.weapons;
    }


    public String getName() {
        return name;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }


    @Override
    public String toString() {
        return "Army{" +
                "\nname='" + name + '\'' +
                ",\n soldiers=" + soldiers +
                ",\n weapons=" + weapons +
                "\n}";
    }

    //Builder Class
    public static class ArmyBuilder{
        private String name;
        private List<Soldier> soldiers;
        private List<Weapon> weapons;

        public ArmyBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ArmyBuilder setSoldiers(List<Soldier> soldiers) {
            this.soldiers = soldiers;
            return this;
        }

        public ArmyBuilder setWeapons(List<Weapon> weapons) {
            this.weapons = weapons;
            return this;
        }

        public Army build(){
            return new Army(this);
        }
    }
}
