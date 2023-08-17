package homework13.model.employee;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(int id, String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.employeeType = EmployeeType.EXPERIENCE;
    }

    @Override
    public String toString() {
        return "Experience{" +
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
