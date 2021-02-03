package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class House implements Building {
    public House() {
    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());

    }
}
