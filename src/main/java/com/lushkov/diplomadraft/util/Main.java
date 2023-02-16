package com.lushkov.diplomadraft.util;

import com.lushkov.diplomadraft.controller.AdminControllerDraft;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Added for test the homework.
 * Logging is for display the sequence of methods' work
 */
public class Main {
    final static Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        AdminControllerDraft adminControllerDraft = new AdminControllerDraft();

        LOG.info("Using Main to call controller methods");

        adminControllerDraft.createUser();

        LOG.info("End of Main work");
    }
}
