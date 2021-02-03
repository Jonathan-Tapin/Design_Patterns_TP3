package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class CityHall implements Building {
    public CityHall() {
    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());
    }
}
