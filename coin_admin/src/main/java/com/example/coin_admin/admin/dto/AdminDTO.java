package com.example.coin_admin.admin.dto;

import java.util.Objects;

public class AdminDTO {
    private String id;
    private String password;

    public AdminDTO() {
    }

    public AdminDTO(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminDTO adminDTO = (AdminDTO) o;
        return id.equals(adminDTO.id) && password.equals(adminDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password);
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
