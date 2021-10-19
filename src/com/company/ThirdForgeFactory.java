package com.company;

public class ThirdForgeFactory implements ForgeFactory{

    @Override
    public Weapon createWeapon(Weapon.Length length){
        return new SpearWeapon(length);
    }

    @Override
    public KillType createKillType(String killType){
        return new PierceKillType();
    }
}
