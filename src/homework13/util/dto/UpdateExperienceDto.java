package homework13.util.dto;

public class UpdateExperienceDto extends CreateExperienceDto {
    public int id;

    public UpdateExperienceDto(String fullName, String dateOfBirth, String phoneNumber, String email, int expInYear, String proSkill, int id) {
        super(fullName, dateOfBirth, phoneNumber, email, expInYear, proSkill);
        this.id = id;
    }
}
