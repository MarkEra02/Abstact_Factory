package com.company;

public interface Weapon {
    enum Length {small, medium, large}

    void kill(KillType killType);

    void block();
}
