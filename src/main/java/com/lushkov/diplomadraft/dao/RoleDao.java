package com.lushkov.diplomadraft.dao;

import com.lushkov.diplomadraft.entity.RoleEntity;

/**
 * DAO for Roles, extends DAO and adds special findByName() method
 *
 * @see Dao
 */
public interface RoleDao extends Dao<RoleEntity> {
    RoleEntity findByName(String name);
}
