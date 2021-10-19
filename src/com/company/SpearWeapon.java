package com.company;

public class SpearWeapon implements Weapon {

    public SpearWeapon(Length length) {
        System.out.println("Weapon Spear with length " + length);
    }

    @Override
    public void kill(KillType killType){
        System.out.println("Spear "+killType);
    }

    @Override
    public void block(){
        System.out.println("Xiaomi blocked attack");
    }
}
