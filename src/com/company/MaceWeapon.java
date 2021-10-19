package com.company;

public class MaceWeapon implements Weapon {

    public MaceWeapon(Length length) {
        System.out.println("Weapon Mace with length " + length);
    }

    @Override
    public void kill(KillType killType){
        System.out.println("Mace "+killType);
    }

    @Override
    public void block(){
        System.out.println("Mace blocked attack");
    }
}