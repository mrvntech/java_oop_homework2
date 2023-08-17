package homework15.model;

import java.util.ArrayList;

public class InOfficeStudent extends Student {
    private String linkedLocation;

    public InOfficeStudent(int id, String fullName, String dateOfBirth, String startYear, Double inputPoint, ArrayList<Double> studyResult, String linkLocation) {
        super(id, fullName, dateOfBirth, startYear, inputPoint, studyResult);
        this.linkedLocation = linkLocation;
    }

    public String getLinkedLocation() {
        return linkedLocation;
    }
}
