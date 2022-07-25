package com.codeup.adlister.dao;

public class ExampleConfig {
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/YOUR_DB_HERE?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUser() {
        return "YOUR_DB_USER_HERE";
    }

    public String getPassword() {
        return "YOUR_DB_PASSWORD_HERE";
    }
}