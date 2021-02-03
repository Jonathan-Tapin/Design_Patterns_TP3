package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class School implements Building {
    public School() {

    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());

    }
}
