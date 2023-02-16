package com.lushkov.diplomadraft.dao;

import java.util.List;

/**
 * Standard CRUD methods
 *
 * @param <E> - entity
 */
public interface Dao<E> {
    void create(E entity);

    void update(E entity);

    void delete(E entity);

    List<E> findAll();

    E read(Long id);
}
