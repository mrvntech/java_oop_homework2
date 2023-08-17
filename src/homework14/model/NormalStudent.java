package homework14.model;

public class NormalStudent extends Student {
    private Double englishScore;
    private Double entryTestScore;

    public NormalStudent(String fullName, String dateOfBirth, boolean sex, String phoneNumber, String universityName, int gradeLevel, Double englishScore, Double entryTestScore) {
        super(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex=" + sex +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }

    public Double getEnglishScore() {
        return englishScore;
    }

    public Double getEntryTestScore() {
        return entryTestScore;
    }
}
