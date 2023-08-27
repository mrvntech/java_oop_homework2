package homework13.util.dto;

public class UpdateFresherDto extends CreateFresherDto {
    public int id;

    public UpdateFresherDto(String fullName, String dateOfBirth, String phoneNumber, String email, String graduationDate, int graduationRank, String education, int id) {
        super(fullName, dateOfBirth, phoneNumber, email, graduationDate, graduationRank, education);
        this.id = id;
    }
}
