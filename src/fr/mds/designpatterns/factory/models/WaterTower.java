package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class WaterTower implements Building {
    public WaterTower() {
    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());

    }
}
