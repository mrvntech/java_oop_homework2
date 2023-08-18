package homework15.model.department;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class Department {
    private final String name;
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalStudent() {
        return students.size();
    }

    public Double getSemesterAverageScore(String semesterName) {
        AtomicReference<Double> totalScore = new AtomicReference<>(0.0);
        students.forEach(student ->
                student.studyResults.forEach(studyResult -> {
                    if (studyResult.getSemesterName().equals(semesterName))
                        totalScore.set(totalScore.get() + studyResult.getSemesterScore());
                })
        );
        return totalScore.get() / getTotalStudent();
    }

    public Student getHighestInputScoreStudent() {
        AtomicReference<Student> highestInputScoreStudent = new AtomicReference<>(students.get(0));
        students.forEach(student -> {
            if (student.getInputPoint() > highestInputScoreStudent.get().getInputPoint())
                highestInputScoreStudent.set(student);
        });
        return highestInputScoreStudent.get();
    }

    public List<Student> getInOfficeStudent(String linkedLocation) {
        return students.stream().filter(student ->
                student.getClass().equals(InOfficeStudent.class) && ((InOfficeStudent) student).getLinkedLocation().equals(linkedLocation)
        ).toList();
    }

    public List<Student> getListStudentWith8() {
        return students.stream().filter(student ->
                student.getStudyResults().get(0).getSemesterScore() >= 8.0
        ).toList();
    }

    public Optional<Student> getHighestScoreStudent(String semester) {
        AtomicReference<Student> highScoreStudent = new AtomicReference<>(students.get(0));
        Optional<StudyResult> studyResult = highScoreStudent.get().getStudyResults().stream().filter(_studyResult ->
                Objects.equals(_studyResult.getSemesterName(), semester)
        ).findFirst();
        if (studyResult.isPresent()) {
            Double highestScore = studyResult.get().getSemesterScore();
            students.forEach(student -> {
                if (student.getStudyResults().stream().anyMatch(studyResult1 ->
                        Objects.equals(studyResult1.getSemesterName(), semester) && studyResult1.getSemesterScore() > highestScore
                )) highScoreStudent.set(student);
            });
            return Optional.of(highScoreStudent.get());
        }
        return Optional.empty();
    }
}
