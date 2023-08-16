package homework13.model;

public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    public Intern(int id, String fullName, String birthDay, String phone, String email, String majors, int semester, String universityName) {
        super(id, fullName, birthDay, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
        this.employeeType = EmployeeType.INTERN;
    }
}
