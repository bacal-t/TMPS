package com.company.factory;


public class FactoryProvider {


    public static AbstractFactory getFactory(String choice){

        if("Weapon".equalsIgnoreCase(choice)){
            return WeaponFactory.getInstance();
        } else if("Soldier".equalsIgnoreCase(choice)){
            return SoldierFactory.getInstance();
        }

        return null;
    }

}
