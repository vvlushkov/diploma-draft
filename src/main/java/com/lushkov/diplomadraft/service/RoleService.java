package com.lushkov.diplomadraft.service;

import com.lushkov.diplomadraft.entity.RoleEntity;

/**
 * Service for Roles, extends Service and adds special findByName() method
 *
 * @see Service
 */
public interface RoleService extends Service<RoleEntity> {
    RoleEntity findByName(String name);
}
