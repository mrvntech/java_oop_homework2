package homework13.util.dto;

public class CreateInternDto extends CreateEmployeeDto {
    public String major;
    public String semester;
    public String universityName;

    @Override
    public String toString() {
        return "CreateInternDto{" +
                "major='" + major + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public CreateInternDto(String fullName, String dateOfBirth, String phoneNumber, String email, String major, String semester, String universityName) {
        super(fullName, dateOfBirth, phoneNumber, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }
}
