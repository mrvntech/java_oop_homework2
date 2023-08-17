package homework13.model.employee;

public class Fresher extends Employee {
    private String graduationDate;
    private int graduationRank;
    private String education;

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank=" + graduationRank +
                ", education='" + education + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                '}';
    }

    public Fresher(int id, String fullName, String birthDay, String phone, String email, String graduationDate, int graduationRank, String education) {
        super(id, fullName, birthDay, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
        this.employeeType = EmployeeType.FRESHER;
    }
}
