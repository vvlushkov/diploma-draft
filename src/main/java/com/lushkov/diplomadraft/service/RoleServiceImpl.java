package com.lushkov.diplomadraft.service;

import com.lushkov.diplomadraft.dao.RoleDao;
import com.lushkov.diplomadraft.entity.RoleEntity;

import java.util.List;

/**
 * Implementation of RoleService. Don't add anything special
 *
 * @see RoleService
 */
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    @Override
    public RoleEntity findByName(String name) {
        return roleDao.findByName(name);
    }

    @Override
    public void create(RoleEntity entity) {
        roleDao.create(entity);
    }

    @Override
    public void update(RoleEntity entity) {
        roleDao.update(entity);
    }

    @Override
    public void delete(RoleEntity entity) {
        roleDao.delete(entity);
    }

    @Override
    public List<RoleEntity> findAll() {
        return roleDao.findAll();
    }

    @Override
    public RoleEntity read(Long id) {
        return roleDao.read(id);
    }
}
