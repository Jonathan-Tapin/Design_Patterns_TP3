package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class PowerPlant implements Building {
    public PowerPlant() {
    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());

    }
}
