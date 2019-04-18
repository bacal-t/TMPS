package com.company.factory;

import com.company.weapon.Bow;
import com.company.weapon.Sword;
import com.company.weapon.Weapon;


//Singleton design pattern
//Factory design pattern
public class WeaponFactory implements AbstractFactory<Weapon> {


    private WeaponFactory(){};

    @Override
    public Weapon create(String weaponType) {

        if ("Sword".equalsIgnoreCase(weaponType)) {
            return new Sword();
        } else if ("Bow".equalsIgnoreCase(weaponType)) {
            return new Bow();
        }

        return null;
    }

    private static class WeaponFactoryHelper{
        private static final WeaponFactory INSTANCE = new WeaponFactory();
    }

    public static WeaponFactory getInstance(){
        return WeaponFactoryHelper.INSTANCE;
    }

}
