package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class Market implements Building {
    public Market() {
    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());

    }
}
