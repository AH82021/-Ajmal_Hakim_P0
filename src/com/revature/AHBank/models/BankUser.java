package com.revature.AHBank.models;

public class BankUser {
    private String firstName;
    private String lastName;
    private String email;
    private String ssn;
    private String username;
    private String password;

    public BankUser(String firstName, String lastName, String email, String ssn, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ssn = ssn;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + ssn + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String fileFormat(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName).append(":")
                .append(lastName).append(":")
                .append(email).append(":")
                .append(ssn).append(":")
                .append(username).append(":")
                .append(password);
        return stringBuilder.toString();
    }
}
