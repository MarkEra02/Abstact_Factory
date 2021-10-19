package com.company;

public class AnotherForgeFactory implements ForgeFactory{

    @Override
    public Weapon createWeapon(Weapon.Length length){
        return new MaceWeapon(length);
    }

    @Override
    public KillType createKillType(String killType){
        return new CrushKillType();
    }
}
