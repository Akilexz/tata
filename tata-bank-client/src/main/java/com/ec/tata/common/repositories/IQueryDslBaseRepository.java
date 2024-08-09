package com.ec.tata.common.repositories;

import java.io.Serializable;

public interface IQueryDslBaseRepository<T> {
    void save(T obj);

    void update(T obj);
}
