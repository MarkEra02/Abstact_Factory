package com.company;

public interface ForgeFactory {

    Weapon createWeapon(Weapon.Length length);

    KillType createKillType(String killType);
}
