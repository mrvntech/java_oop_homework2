package homework14.model;

public class GoodStudent extends Student {
    private Double gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String dateOfBirth, boolean sex, String phoneNumber, String universityName, int gradeLevel, Double gpa, String bestRewardName) {
        super(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
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
