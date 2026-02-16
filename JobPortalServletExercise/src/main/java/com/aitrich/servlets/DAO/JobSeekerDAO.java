package com.aitrich.servlets.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.aitrich.servlets.Entity.JobSeeker;

public class JobSeekerDAO {

    String dbURL = "jdbc:mysql://localhost:3306/servlet_db";
    String dbUser = "root";
    String dbPass = "AbiMySQL678";

    public void addJobSeeker(JobSeeker js) {
        String query = "INSERT INTO job_seeker (id, name, email, skills, resume) VALUES (?,?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setInt(1, js.getId());
            psmt.setString(2, js.getName());
            psmt.setString(3, js.getEmail());
            psmt.setString(4, js.getSkills());
            psmt.setString(5, js.getResume());

            int rows = psmt.executeUpdate();
            System.out.println(rows + " rows affected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JobSeeker getJobSeekerById(int id) {

        JobSeeker js = null;
        String sql = "SELECT * FROM job_seeker WHERE id=?";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                js = new JobSeeker();
                js.setId(rs.getInt("id"));
                js.setName(rs.getString("name"));
                js.setEmail(rs.getString("email"));
                js.setSkills(rs.getString("skills"));
                js.setResume(rs.getString("resume"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return js;
    }

    public ArrayList<JobSeeker> showAllJobSeekers() {

        ArrayList<JobSeeker> jobSeekerList = new ArrayList<>();

        String query = "SELECT * FROM job_seeker";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query);
             ResultSet rs = psmt.executeQuery()) {

            while (rs.next()) {

                JobSeeker js = new JobSeeker();

                js.setId(rs.getInt("id"));
                js.setName(rs.getString("name"));
                js.setEmail(rs.getString("email"));
                js.setSkills(rs.getString("skills"));
                js.setResume(rs.getString("resume"));

                jobSeekerList.add(js);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jobSeekerList;
    }

    public void updateJobSeeker(JobSeeker js) {

        String query = "UPDATE job_seeker SET name=?, email=?, skills=?, resume=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setString(1, js.getName());
            psmt.setString(2, js.getEmail());
            psmt.setString(3, js.getSkills());
            psmt.setString(4, js.getResume());
            psmt.setInt(5, js.getId());

            int rows = psmt.executeUpdate();
            System.out.println(rows + " rows affected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteJobSeekerById(int id) {

        String query = "DELETE FROM job_seeker WHERE id=?";

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