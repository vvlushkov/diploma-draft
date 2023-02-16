package com.lushkov.diplomadraft.service;

import java.util.List;

/**
 * Methods of the business layer, at this stage only CRUD
 * @param <E>
 */
public interface Service<E> {

    void create(E entity);

    void update(E entity);

    void delete(E entity);

    List<E> findAll();

    E read(Long id);
}
