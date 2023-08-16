package homework13.model;

public class Experiance extends Employee {
    private int expInYear;
    private String proSkill;

    public Experiance(int id, String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.employeeType = EmployeeType.EXPERIENCE;
    }

    @Override
    public String toString() {
        return "Experiance{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                '}';
    }
}
