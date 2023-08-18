package homework15.model.department;

import java.util.ArrayList;

public class InOfficeStudent extends Student {
    private final String linkedLocation;

    public InOfficeStudent(int id, String fullName, String dateOfBirth, String startYear, Double inputPoint, String linkLocation) {
        super(id, fullName, dateOfBirth, startYear, inputPoint);
        this.linkedLocation = linkLocation;
    }

    public String getLinkedLocation() {
        return linkedLocation;
    }

    @Override
    public String toString() {
        return "InOfficeStudent{" +
                "linkedLocation='" + linkedLocation + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", startYear='" + startYear + '\'' +
                ", inputPoint=" + inputPoint +
                ", studyResults=" + studyResults +
                '}';
    }
}
