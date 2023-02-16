package com.lushkov.diplomadraft.dao;

import com.lushkov.diplomadraft.entity.UserEntity;

/**
 * DAO for Users, extends DAO and adds special findByLogin() and findByEmail() methods
 *
 * @see Dao
 */
public interface UserDao extends Dao<UserEntity> {
    UserEntity findByLogin(String login);

    UserEntity findByEmail(String email);
}
