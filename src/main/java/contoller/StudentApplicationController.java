package contoller;

import domain.StudentApplication;
import services.StudentApplicationService;

import java.util.List;
public class StudentApplicationController {
    private final StudentApplicationService service = new StudentApplicationService();

    public boolean addStudent(StudentApplication student) {
        return service.createStudentApplication(student);
    }

    public StudentApplication findStudentById(String studentId) {
        return service.getStudentById(studentId);
    }

    public List<StudentApplication> getAllStudents() {
        return service.getAllStudents();
    }
}
