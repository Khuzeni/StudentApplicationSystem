package App;

import DAO.StudentApplicationDAO;
import domain.StudentApplication;

public class TestRead {
    public static void main(String[] args) {
        StudentApplicationDAO dao = new StudentApplicationDAO();
        StudentApplication student = dao.getStudentById("TEST123");

        if (student != null) {
            System.out.println("Student Found: " + student.getName());
        } else {
            System.out.println("No student found.");
        }
    }
}
