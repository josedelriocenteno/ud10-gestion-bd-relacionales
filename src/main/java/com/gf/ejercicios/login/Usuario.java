package com.gf.ejercicios.login;


public class Usuario {
    private int id_user;
    private String user;
    private String password;
    private int blocked;

    public Usuario() {
    }

    public Usuario(int id_user, String user, String password, int blocked) {
        this.id_user = id_user;
        this.user = user;
        this.password = password;
        this.blocked = blocked;
    }

  

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }
    
    
}
