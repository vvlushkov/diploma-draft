package com.lushkov.diplomadraft.dao;

import com.lushkov.diplomadraft.controller.AdminControllerDraft;
import com.lushkov.diplomadraft.entity.UserEntity;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Class added for test. Implements UserDao
 *
 * @see UserDao
 */
public class UserDaoImpl implements UserDao {
    final static Logger LOG = LogManager.getLogger(UserDaoImpl.class);

    @Override
    public void create(UserEntity entity) {
        LOG.info("Creating User using UserDaoImpl method");
    }

    @Override
    public void update(UserEntity entity) {

    }

    @Override
    public void delete(UserEntity entity) {

    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public UserEntity read(Long id) {
        return null;
    }

    @Override
    public UserEntity findByLogin(String login) {
        return null;
    }

    @Override
    public UserEntity findByEmail(String email) {
        return null;
    }
}
