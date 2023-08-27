package homework14.util.dto;

public class CreateNormalStudentDto extends CreateStudentDto {
    public double entryTestScore;
    public double englishScore;

    public CreateNormalStudentDto(String fullName, String dateOfBirth, String sex, String phoneNumber, String universityName, int gradeLevel, double entryTestScore, double englishScore) {
        super(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel);
        this.entryTestScore = entryTestScore;
        this.englishScore = englishScore;
    }
}
