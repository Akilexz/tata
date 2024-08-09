package com.ec.tata.common.repositories;

public interface IQueryDslBaseRepository<T> {
    void save(T obj);

    void update(T obj);
}
