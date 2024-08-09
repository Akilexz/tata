package com.ec.tata.common.services;

import java.io.Serializable;

public interface IBaseService<T> {
    void save(T obj);

    void update(T obj);
}
