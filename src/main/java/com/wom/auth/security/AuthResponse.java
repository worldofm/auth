package com.wom.auth.security;

public class AuthResponse {

    String token;

    AuthResponse(String tokent) {
        this.token = tokent;
    }

    public String getToken() {
        return token;
    }
}
