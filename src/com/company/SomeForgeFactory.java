package com.company;

public class SomeForgeFactory implements ForgeFactory{

    @Override
    public Weapon createWeapon(Weapon.Length length){
        return new SwordWeapon(length);
    }

    @Override
    public KillType createKillType(String killType){
        return new CutKillType();
    }
}
