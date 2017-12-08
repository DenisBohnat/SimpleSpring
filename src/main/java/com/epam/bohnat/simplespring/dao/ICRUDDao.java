package com.epam.bohnat.simplespring.dao;

import com.epam.bohnat.simplespring.domain.AbstractEntity;

import java.util.List;

public interface ICRUDDao<K extends AbstractEntity> {

    List<AbstractEntity> getAll();

    //void create(K entity);

   // void update(K entity);

   // void delete(K entity);

   // K findEntityById(int id);
}
