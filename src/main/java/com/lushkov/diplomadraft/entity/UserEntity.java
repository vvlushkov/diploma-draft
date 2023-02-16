package com.lushkov.diplomadraft.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

/**
 * Class that represent User entity from DB (table Users)
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private Long userId;
    private RoleEntity role;
    private String firstName;
    private String lastName;
    private String login;
    private Date dateOfBirth;
    private String password;
    private String email;

    public UserEntity(RoleEntity role,
                String firstName,
                String lastName,
                String login,
                Date dob,
                String password,
                String email) {
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.dateOfBirth = dob;
        this.password = password;
        this.email = email;
    }

    public UserEntity(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity user = (UserEntity) o;

        if (!userId.equals(user.userId)) return false;
        if (!login.equals(user.login)) return false;
        if (!password.equals(user.password)) return false;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", role=" + role +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", dob=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
