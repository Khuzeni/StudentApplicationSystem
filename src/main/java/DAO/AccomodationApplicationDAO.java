package DAO;
import App.JDBC;
import domain.AccomodationApplication;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccomodationApplicationDAO {
    // Insert new accommodation option
    public boolean insertAccommodation(AccomodationApplication acc) {
        String sql = "INSERT INTO accomapplication(option_id, name, location, monthly_cost, availability, capacity) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, acc.getOptionId());
            pstmt.setString(2, acc.getName());
            pstmt.setString(3, acc.getLocation());
            pstmt.setDouble(4, acc.getMonthlyCost());
            pstmt.setBoolean(5, acc.isAvailability());
            pstmt.setInt(6, acc.getCapacity());

            return pstmt.executeUpdate() > 0;


        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Fetch accommodation option by optionId
    public AccomodationApplication getAccomodationById(String optionId) {
        String sql = "SELECT * FROM accomapplication WHERE option_id = ?";
        AccomodationApplication app = null;

        try (Connection conn = JDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {


            pstmt.setString(1, optionId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                app = new AccomodationApplication.Builder().build();
                app.setOptionId(rs.getString("option_id"));
                app.setName(rs.getString("name"));
                app.setLocation(rs.getString("location"));
                app.setMonthlyCost(rs.getDouble("monthly_cost"));
                app.setAvailability(rs.getBoolean("availability"));
                app.setCapacity(rs.getInt("capacity"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return app;
    }

    // Optional: Fetch all accommodations
    public List<AccomodationApplication> getAllAccomodations() {
        String sql = "SELECT * FROM accomapplication";
        List<AccomodationApplication> list = new ArrayList<>();

        try (Connection conn = JDBC.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                AccomodationApplication app = new AccomodationApplication.Builder().build();
                app.setOptionId(rs.getString("option_id"));
                app.setName(rs.getString("name"));
                app.setLocation(rs.getString("location"));
                app.setMonthlyCost(rs.getDouble("monthly_cost"));
                app.setAvailability(rs.getBoolean("availability"));
                app.setCapacity(rs.getInt("capacity"));
                list.add(app);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean insertAccomodationApplication(AccomodationApplication accomodation) {
        return false;
    }

    public List<AccomodationApplication> getAllAccomodationApplications() {
    return null;}
}
