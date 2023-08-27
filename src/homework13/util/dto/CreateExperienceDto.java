package homework13.util.dto;

public class CreateExperienceDto extends CreateEmployeeDto {
    public int expInYear;
    public String proSkill;

    @Override
    public String toString() {
        return "CreateExperienceDto{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public CreateExperienceDto(String fullName, String dateOfBirth, String phoneNumber, String email, int expInYear, String proSkill) {
        super(fullName, dateOfBirth, phoneNumber, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
}
