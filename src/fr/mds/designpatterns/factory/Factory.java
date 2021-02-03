package fr.mds.designpatterns.factory;

import java.io.IOException;
import java.util.List;

public interface Factory {
    Building constructBuilding() throws IOException, ClassNotFoundException;
}
