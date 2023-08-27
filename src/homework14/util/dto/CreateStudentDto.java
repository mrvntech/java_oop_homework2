package homework14.util.dto;

public abstract class CreateStudentDto {
    public String fullName;
    public String dateOfBirth;
    public String sex;
    public String phoneNumber;

    public CreateStudentDto(String fullName, String dateOfBirth, String sex, String phoneNumber, String universityName, int gradeLevel) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String universityName;
    public int gradeLevel;
}
