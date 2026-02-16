package com.aitrich.servlets.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.aitrich.servlets.Entity.Job;

public class JobDAO {

    String dbURL = "jdbc:mysql://localhost:3306/servlet_db";
    String dbUser = "root";
    String dbPass = "AbiMySQL678";

    public void addJob(Job job) {

        String query = "INSERT INTO job (id, title, description, salary, employer_id) VALUES (?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setInt(1, job.getId());
            psmt.setString(2, job.getTitle());
            psmt.setString(3, job.getDescription());
            psmt.setDouble(4, job.getSalary());
            psmt.setInt(5, job.getEmployerId());

            int rows = psmt.executeUpdate();
            System.out.println(rows + " rows affected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Job getJobById(int id) {

        Job job = null;
        String query = "SELECT * FROM job WHERE id=?";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setInt(1, id);

            ResultSet rs = psmt.executeQuery();

            if (rs.next()) {
                job = new Job();
                job.setId(rs.getInt("id"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setSalary(rs.getDouble("salary"));
                job.setEmployerId(rs.getInt("employer_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return job;
    }

    public ArrayList<Job> showAllJobs() {

        ArrayList<Job> jobList = new ArrayList<>();
        String query = "SELECT * FROM job";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query);
             ResultSet rs = psmt.executeQuery()) {

            while (rs.next()) {
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setSalary(rs.getDouble("salary"));
                job.setEmployerId(rs.getInt("employer_id"));

                jobList.add(job);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jobList;
    }

    public void updateJob(Job job) {

        String query = "UPDATE job SET title=?, description=?, salary=?, employer_id=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setString(1, job.getTitle());
            psmt.setString(2, job.getDescription());
            psmt.setDouble(3, job.getSalary());
            psmt.setInt(4, job.getEmployerId());
            psmt.setInt(5, job.getId());

            int rows = psmt.executeUpdate();
            System.out.println(rows + " rows affected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteJobById(int id) {

        String query = "DELETE FROM job WHERE id=?";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setInt(1, id);

            int rows = psmt.executeUpdate();
            System.out.println(rows + " rows affected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}