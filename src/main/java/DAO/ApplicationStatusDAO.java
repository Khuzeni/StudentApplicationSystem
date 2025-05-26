package DAO;

import App.JDBC;
import domain.ApplicationStatus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationStatusDAO {
    // Insert new application status
    public boolean insertStatus(ApplicationStatus status) {
        String sql = "INSERT INTO applicationstatus (status_id, student_id, status, decision_date, comments) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, status.getStatusId());

            pstmt.setString(1, status.getStatusId());
            pstmt.setString(2, status.getStudentId());
            pstmt.setString(3, status.getStatus());
            pstmt.setDate(4, Date.valueOf(status.getDecisionDate())); // assumes yyyy-mm-dd format
            pstmt.setString(5, status.getComments());

            return pstmt.executeUpdate() > 0;


        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Fetch status records by studentId
    public ApplicationStatus getStatusById(String statusId) {
        String sql = "SELECT * FROM applicationstatus WHERE status_id = ?";
        ApplicationStatus status = null;

        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, statusId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                status = new ApplicationStatus.Builder().build();
                status.setStatusId(rs.getString("status_id"));
                status.setStudentId(rs.getString("student_id"));
                status.setStatus(rs.getString("status"));
                status.setDecisionDate(rs.getString("decision_date"));
                status.setComments(rs.getString("comments"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return status;
    }
    public List<ApplicationStatus> getAllStatuses() {
        String sql = "SELECT * FROM applicationstatus";
        List<ApplicationStatus> list = new ArrayList<>();

        try (Connection conn = JDBC.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ApplicationStatus status = new ApplicationStatus.Builder().build();
                status.setStatusId(rs.getString("status_id"));
                status.setStudentId(rs.getString("student_id"));
                status.setStatus(rs.getString("status"));
                status.setDecisionDate(rs.getString("decision_date"));
                status.setComments(rs.getString("comments"));
                list.add(status);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean insertApplicationStatus(ApplicationStatus status) {
    return false;
    }

    public ApplicationStatus getStatusByStudentId(String studentId) {
    return null;}
}

