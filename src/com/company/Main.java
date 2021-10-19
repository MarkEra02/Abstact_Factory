package com.company;

public class Main {

    public static void main(String[] args) {
        ForgeFactory factory = new ThirdForgeFactory();

        Weapon weapon = factory.createWeapon(Weapon.Length.large);
        KillType killType = factory.createKillType("piercing");
        weapon.kill(killType);

        weapon.block();
    }
}
