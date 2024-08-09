package com.ec.tata.common.services;

public interface IBaseService<T> {
    void save(T obj);

    void update(T obj);
}
