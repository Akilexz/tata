package com.ec.tata.common.services;

import java.io.Serializable;
import com.ec.tata.common.repositories.IQueryDslBaseRepository;
import com.ec.tata.common.services.IBaseService;
import org.springframework.transaction.annotation.Transactional;

public abstract class BaseService<T, R extends IQueryDslBaseRepository<T>> implements
    IBaseService<T> {

    protected final R repository;

    public BaseService(R reposiroty) {
        this.repository = reposiroty;
    }

    @Transactional
    @Override
    public void save(T obj) {
        this.repository.save(obj);
    }

    @Transactional
    @Override
    public void update(T obj) {
        this.repository.save(obj);
    }
}
