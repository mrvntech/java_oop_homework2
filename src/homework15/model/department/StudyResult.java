package homework15.model.department;

public class StudyResult {
    private final String semesterName;
    private final Double semesterScore;

    public String getSemesterName() {
        return semesterName;
    }

    public Double getSemesterScore() {
        return semesterScore;
    }

    public StudyResult(String semesterName, Double semesterScore) {
        this.semesterName = semesterName;
        this.semesterScore = semesterScore;
    }
}
