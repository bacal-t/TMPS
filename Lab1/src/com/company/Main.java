package com.company;


import com.company.army.Army;
import com.company.factory.FactoryProvider;
import com.company.factory.SoldierFactory;
import com.company.factory.WeaponFactory;
import com.company.soldier.Cavalry;
import com.company.soldier.Soldier;
import com.company.weapon.Sword;
import com.company.weapon.Weapon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //get weapon and soldier factory (abstract factory design pattern)
        WeaponFactory weaponFactory = (WeaponFactory) FactoryProvider.getFactory("Weapon");
        SoldierFactory soldierFactory = (SoldierFactory) FactoryProvider.getFactory("Soldier");

        List<Soldier> soldiers = createSoldiers(soldierFactory);
        List<Weapon> weapons = createWeapons(weaponFactory);

        soldiers.forEach(person -> person.fight());
        weapons.forEach(job -> job.dealDamage());

        Army army = new Army
                .ArmyBuilder()
                .setName("The coolest army")
                .setSoldiers(soldiers)
                .setWeapons(weapons)
                .build();

        System.out.println(army);

    }

    public static List<Soldier> createSoldiers(SoldierFactory soldierFactory) {
        List<Soldier> soldiers = new ArrayList<>();

        //create infantry and cavalry soldiers using soldier factory (factory design pattern)
        Soldier infantry1 = soldierFactory.create("Infantry");
        Soldier cavalry1 = soldierFactory.create("Cavalry");
        Soldier cavalry2 = null;

        infantry1.setName("Gabriel");

        cavalry1.setName("Vasile");
        cavalry1.setDamage(100);
        cavalry1.setHealth(200);

        try {
            //create cavalry2 with clone() method (prototype design pattern)
            cavalry2 = (Soldier) ((Cavalry) cavalry1).clone();
            cavalry2.setName("Vladislav");
            cavalry2.setDamage(140);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        soldiers.addAll(Arrays.asList(infantry1, cavalry1, cavalry2));
        return soldiers;
    }


    public static List<Weapon> createWeapons(WeaponFactory weaponFactory) {
        List<Weapon> weapons = new ArrayList<>();

        //create sword and bow using weapon factory (factory design pattern)
        Weapon bow1 = weaponFactory.create("Bow");
        Weapon sword1 = weaponFactory.create("Sword");
        Weapon sword2 = null;

        bow1.setName("Wood Bow");

        sword1.setName("Light Magic Sword");
        sword1.setWeight(10);
        sword1.setDamage(500);

        try {
            //create sword2 with clone() method (prototype design pattern)
            sword2 = (Weapon) ((Sword) sword1).clone();
            sword2.setName("Dark Magic Sword");
            sword2.setDamage(550);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        weapons.addAll(Arrays.asList(bow1, sword1, sword2));

        return weapons;
    }


}
