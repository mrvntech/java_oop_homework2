package homework14.model.student;

public class GoodStudent extends Student {
    private final Double gpa;
    private final String bestRewardName;

    public GoodStudent(String fullName, String dateOfBirth, boolean sex, String phoneNumber, String universityName, int gradeLevel, Double gpa, String bestRewardName) {
        super(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex=" + sex +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
