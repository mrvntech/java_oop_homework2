package homework14.util.dto;

public class CreateGoodStudentDto extends CreateStudentDto {
    public double gpa;
    public String bestRewardName;

    public CreateGoodStudentDto(String fullName, String dateOfBirth, String sex, String phoneNumber, String universityName, int gradeLevel, double gpa, String bestRewardName) {
        super(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }
}
