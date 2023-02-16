package com.lushkov.diplomadraft.controller;

import com.lushkov.diplomadraft.entity.UserEntity;
import com.lushkov.diplomadraft.service.UserService;
import com.lushkov.diplomadraft.service.UserServiceImpl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Draft of Admin controller with some methods to test
 */
public class AdminControllerDraft {
    final static Logger LOG = LogManager.getLogger(AdminControllerDraft.class);

    UserService userService = new UserServiceImpl();
    UserEntity draftUser = new UserEntity();

    public void createUser() {
        LOG.info("Using controller to add user");
        userService.create(draftUser);
        LOG.info("End of controller work");
    }

}
