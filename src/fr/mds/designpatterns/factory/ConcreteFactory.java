package fr.mds.designpatterns.factory;


import java.io.IOException;
import java.util.ArrayList;

import static fr.mds.designpatterns.factory.utils.ClassUtils.getClasses;

public class ConcreteFactory implements Factory {

    @Override
    public Building constructBuilding() throws IOException, ClassNotFoundException {
      Class<?>[] clazz =  getClasses("models");
      Building building = constructBuilding();
      Building result = null;
        for (int i = 0; i < clazz.length; i++) {
            result = building;
        }
        return result;
    }
}
