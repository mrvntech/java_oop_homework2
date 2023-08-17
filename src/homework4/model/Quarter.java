package homework4.model;

import java.util.ArrayList;

public class Quarter {
    private final ArrayList<Family> families = new ArrayList<Family>();

    public void addFamily(Family family) {
        families.add(family);
    }

    @Override
    public String toString() {
        return "Quarter{" +
                "families=" + families.toString() +
                '}';
    }
}
