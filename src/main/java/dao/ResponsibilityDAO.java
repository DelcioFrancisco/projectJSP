package dao;

import model.Responsibility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResponsibilityDAO {

    public void insert(Responsibility responsibility) throws SQLException {
        String sql = "INSERT INTO responsibility (name) VALUES (?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, responsibility.getDescription());
            stmt.executeUpdate();
        }
    }

    public List<Responsibility> getAll() throws SQLException {
        List<Responsibility> responsibilities = new ArrayList<>();
        String sql = "SELECT * FROM responsibility";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                responsibilities.add(new Responsibility(
                        rs.getInt("id"),
                        rs.getString("name")
                ));
            }
        }
        return responsibilities;
    }

    public Responsibility getById(int id) {
        String sql = "SELECT * FROM responsibility WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Responsibility(
                        rs.getInt("id"),
                        rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace(); // ou logger
        }
        return null; // ou lançar RuntimeException
    }
}
