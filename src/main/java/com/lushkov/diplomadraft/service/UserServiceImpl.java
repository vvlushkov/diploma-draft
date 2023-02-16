package com.lushkov.diplomadraft.service;

import com.lushkov.diplomadraft.controller.AdminControllerDraft;
import com.lushkov.diplomadraft.dao.UserDao;
import com.lushkov.diplomadraft.dao.UserDaoImpl;
import com.lushkov.diplomadraft.entity.UserEntity;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Implementation of UserService. Don't add anything special
 *
 * @see UserService
 */
public class UserServiceImpl implements UserService {

    final static Logger LOG = LogManager.getLogger(UserServiceImpl.class);

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void create(UserEntity entity) {
        LOG.info("Using UserService to create user");
        userDao.create(entity);
        LOG.info("End of user service work");
    }

    @Override
    public void update(UserEntity entity) {
        userDao.update(entity);
    }

    @Override
    public void delete(UserEntity entity) {
        userDao.delete(entity);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }

    @Override
    public UserEntity read(Long id) {
        return userDao.read(id);
    }

    @Override
    public UserEntity findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
