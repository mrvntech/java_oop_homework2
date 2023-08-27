package homework13.util.dto;

public class UpdateInternDto extends CreateInternDto {
    public int id;

    public UpdateInternDto(String fullName, String dateOfBirth, String phoneNumber, String email, String major, String semester, String universityName, int id) {
        super(fullName, dateOfBirth, phoneNumber, email, major, semester, universityName);
        this.id = id;
    }
}
