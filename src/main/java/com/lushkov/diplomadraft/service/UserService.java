package com.lushkov.diplomadraft.service;

import com.lushkov.diplomadraft.dao.Dao;
import com.lushkov.diplomadraft.entity.UserEntity;

/**
 * Service for Users, extends Service and adds special findByLogin() and findByEmail() methods
 *
 * @see Service
 */
public interface UserService extends Service<UserEntity>{
    UserEntity findByLogin(String login);

    UserEntity findByEmail(String email);
}
