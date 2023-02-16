package com.lushkov.diplomadraft.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Class that represent Role entity from DB (table Roles)
 */
@Getter
@Setter
public class RoleEntity {
    private Long roleId;
    private String name;

    public RoleEntity() {}

    public RoleEntity(Long roleId) {
        this.roleId = roleId;
    }
    public RoleEntity(String name) {
        this.name = name;
    }

    public RoleEntity(Long roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity role = (RoleEntity) o;

        if (!roleId.equals(role.roleId)) return false;
        return name.equals(role.name);
    }

    @Override
    public int hashCode() {
        int result = roleId.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", name='" + name + '\'' +
                '}';
    }
}
