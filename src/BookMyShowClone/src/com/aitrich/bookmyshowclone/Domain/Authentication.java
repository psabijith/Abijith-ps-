package com.aitrich.bookmyshowclone.Domain;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Authentication {

    private Map<String, AuthUser> users;
    private final String file = "Authentication.txt";

    public Authentication() {
        users = new HashMap<>();
    }

    // ---------------- LOAD USERS ----------------
    public void loadUsers() {

        File f = new File(file);

        if (!f.exists()) {
            return;
        }

        users.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String username = parts[0];
                    String password = parts[1];
                    Role role = Role.valueOf(parts[2].toUpperCase());

                    users.put(username, new AuthUser(username, password, role));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------------- REGISTER ----------------
    public boolean register(String username, String password, Role role) {

        if (username.isBlank() || password.isBlank()) {
            System.out.println("Username / Password cannot be empty ");
            return false;
        }

        loadUsers();

        if (users.containsKey(username)) {
            System.out.println("User already exists ");
            return false;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(username + "," + password + "," + role.name());
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        users.put(username, new AuthUser(username, password, role));
        return true;
    }

    // ---------------- LOGIN ----------------
    public AuthUser login(String username, String password) {

        if (username.isBlank() || password.isBlank()) {
            System.out.println("Username / Password cannot be empty ");
            return null;
        }

        loadUsers();

        AuthUser user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            return user; 
        }

        return null;
    }
}
