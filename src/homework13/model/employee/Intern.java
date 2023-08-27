package homework13.model.employee;

public class Intern extends Employee {
    private String major;
    private String semester;
    private String universityName;

    public Intern(int id, String fullName, String birthDay, String phone, String email, String major, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
        this.employeeType = EmployeeType.INTERN;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + major + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                ", certificates=" + certificates +
                '}';
    }
}
