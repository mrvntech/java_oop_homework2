package homework13.util.dto;

public class CreateEmployeeDto {
    public String fullName;
    public String dateOfBirth;
    public String phoneNumber;
    public String email;

    public CreateEmployeeDto(String fullName, String dateOfBirth, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "CreateEmployeeDto{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
