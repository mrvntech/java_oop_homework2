package homework13.util.dto;

public class CreateFresherDto extends CreateEmployeeDto {
    public String graduationDate;
    public int graduationRank;
    public String education;

    public CreateFresherDto(String fullName, String dateOfBirth, String phoneNumber, String email, String graduationDate, int graduationRank, String education) {
        super(fullName, dateOfBirth, phoneNumber, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public String toString() {
        return "CreateFresherDto{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank=" + graduationRank +
                ", education='" + education + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
