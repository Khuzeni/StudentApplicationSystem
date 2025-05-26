package services;

import DAO.StudentApplicationDAO;
import domain.StudentApplication;

import java.util.List;

public class StudentApplicationService {
    private final StudentApplicationDAO dao = new StudentApplicationDAO();

    public boolean createStudentApplication(StudentApplication student) {
        return dao.insertStudentApplication(student);
    }
    public StudentApplication getStudentById(String studentId) {
        return dao.getStudentById(studentId);
    }

    public List<StudentApplication> getAllStudents() {
        return dao.getAllStudents();
    }
}
