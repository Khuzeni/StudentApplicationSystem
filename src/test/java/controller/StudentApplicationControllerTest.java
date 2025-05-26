package controller;

import contoller.StudentApplicationController;
import controller.StudentApplicationControllerTest;
import domain.StudentApplication;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class StudentApplicationControllerTest {
    private StudentApplicationController controller;

    @BeforeEach
    public void setup() {
        controller = new StudentApplicationController();
    }

    @Test
    public void testAddStudent() {
        StudentApplication student = new StudentApplication.Builder()
                .setStudentId("TEST001")
                .setName("Test")
                .setSurname("User")
                .setEmail("test@cput.ac.za")
                .setAverageMark(75.0)
                .setCurrentCampus("CPUT")
                .setStatus("Pending")
                .build();

        boolean result = controller.addStudent(student);
        assertTrue(result, "Student should be added successfully.");
    }

    @Test
    public void testFindStudentById() {
        StudentApplication student = controller.findStudentById("TEST001");
        assertNotNull(student, "Student should be found.");
        assertEquals("TEST001", student.getStudentId());
    }

    @Test
    public void testGetAllStudents() {
        List<StudentApplication> students = controller.getAllStudents();
        assertNotNull(students);
        assertTrue(students.size() > 0);
    }
}
