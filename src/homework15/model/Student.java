package homework15.model;

import java.util.ArrayList;

public class Student {
    protected int id;
    protected String fullName;
    protected String dateOfBirth;
    protected String startYear;
    protected Double inputPoint;
    protected ArrayList<Double> studyResult = new ArrayList<Double>();

    public Student(int id, String fullName, String dateOfBirth, String startYear, Double inputPoint, ArrayList<Double> studyResult) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.startYear = startYear;
        this.inputPoint = inputPoint;
        this.studyResult = studyResult;
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

    public ArrayList<Double> getStudyResult() {
        return studyResult;
    }
}
