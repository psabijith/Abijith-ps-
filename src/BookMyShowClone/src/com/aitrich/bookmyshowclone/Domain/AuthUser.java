package com.aitrich.bookmyshowclone.Domain;

public class AuthUser {
    private String username;
    private String password;
    private Role role;

    public AuthUser(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getPassword() { return password; }
    public Role getRole() { return role; }

	public String getUsername() { return username; }

}
