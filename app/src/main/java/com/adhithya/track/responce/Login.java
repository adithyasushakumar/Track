package com.adhithya.track.responce;

import com.adhithya.track.model.User;

import java.util.List;

/**
 * Created by Hari Group Unity on 16-03-2018.
 */

public class Login {
    int status;
    String message;
    List<User> user;

    public Login() {
    }

    public Login(int status, String message, List<User> user) {
        this.status = status;
        this.message = message;
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
