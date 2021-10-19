package com.company;

public class SwordWeapon implements Weapon {

    public SwordWeapon(Length length) {
        System.out.println("Weapon Sword with length " + length);
    }

    @Override
    public void kill(KillType killType){
        System.out.println("Sword " + killType);
    }

    @Override
    public void block(){
        System.out.println("Sword blocked attack");
    }
}
