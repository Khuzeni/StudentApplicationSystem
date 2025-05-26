package DAO;

import App.JDBC;
import domain.StudentApplication;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentApplicationDAO {
    // Insert new StudentApplication
    public boolean insertStudentApplication(StudentApplication student) {
        String sql = "INSERT INTO studentapplication (student_id, name, surname, email, average_mark, current_campus, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, student.getStudentId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getSurname());
            pstmt.setString(4, student.getEmail());
            pstmt.setDouble(5, student.getAverageMark());
            pstmt.setString(6, student.getCurrentCampus());
            pstmt.setString(7, student.getStatus());

            int affected = pstmt.executeUpdate();
            return affected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Fetch student by studentId
    public StudentApplication getStudentById(String studentId) {
        String sql = "SELECT * FROM studentapplication WHERE student_id = ?";
        StudentApplication student = null;

        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, studentId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                student = new StudentApplication.Builder().build();
                student.setStudentId(rs.getString("student_id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setEmail(rs.getString("email"));
                student.setAverageMark(rs.getDouble("average_mark"));
                student.setCurrentCampus(rs.getString("current_campus"));
                student.setStatus(rs.getString("status"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }

    // Optional: Fetch all students
    public List<StudentApplication> getAllStudents() {
        String sql = "SELECT * FROM student_applications";
        List<StudentApplication> students = new ArrayList<>();

        try (Connection conn = JDBC.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                StudentApplication student = new StudentApplication.Builder().build();
                student.setStudentId(rs.getString("student_id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setEmail(rs.getString("email"));
                student.setAverageMark(rs.getDouble("average_mark"));
                student.setCurrentCampus(rs.getString("current_campus"));
                student.setStatus(rs.getString("status"));
                students.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
//STORAGE
    public void save(StudentApplication student) {}
}
