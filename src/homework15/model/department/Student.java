package homework15.model.department;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Student {
    protected int id;
    protected String fullName;
    protected String dateOfBirth;
    protected String startYear;
    protected Double inputPoint;
    protected ArrayList<StudyResult> studyResults = new ArrayList<StudyResult>();

    public Student(int id, String fullName, String dateOfBirth, String startYear, Double inputPoint) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.startYear = startYear;
        this.inputPoint = inputPoint;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStartYear() {
        return startYear;
    }

    public Double getInputPoint() {
        return inputPoint;
    }

    public ArrayList<StudyResult> getStudyResults() {
        return studyResults;
    }

    public boolean isInOfficeStudent() {
        return this.getClass().equals(InOfficeStudent.class);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", startYear='" + startYear + '\'' +
                ", inputPoint=" + inputPoint +
                ", studyResults=" + studyResults +
                '}';
    }
}
