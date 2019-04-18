package com.company.factory;

import com.company.soldier.Cavalry;
import com.company.soldier.Infantry;
import com.company.soldier.Soldier;

//Singleton design pattern
//Factory design pattern
public class SoldierFactory implements AbstractFactory<Soldier> {

    private SoldierFactory(){};

    @Override
    public Soldier create(String soldierType) {

        if ("Infantry".equalsIgnoreCase(soldierType)) {
            return new Infantry();
        } else if ("Cavalry".equalsIgnoreCase(soldierType)) {
            return new Cavalry();
        }

        return null;
    }

    private static class SoldierFactoryHelper{
        private static final SoldierFactory INSTANCE = new SoldierFactory();
    }

    public static SoldierFactory getInstance(){
        return SoldierFactoryHelper.INSTANCE;
    }

}
