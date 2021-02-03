package fr.mds.designpatterns.factory.models;

import fr.mds.designpatterns.factory.Building;

public class FireDepartment implements Building {
    public FireDepartment() {
    }

    @Override
    public void doSmth() {
        System.out.println(getClass().getSimpleName());
    }
}
