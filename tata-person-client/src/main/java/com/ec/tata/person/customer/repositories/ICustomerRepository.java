package com.ec.tata.person.customer.repositories;

import com.ec.tata.account.vo.customer.FindAllCustomerVo;
import com.ec.tata.common.repositories.IQueryDslBaseRepository;
import com.ec.tata.person.entities.CustomerEntity;

import java.util.List;

/**
 * Repository interface for customer resources
 *
 * @author Joel Castro
 * @version 1.0
 */
public interface ICustomerRepository extends IQueryDslBaseRepository<CustomerEntity> {
    /**
     * find all customer
     *
     * @return FindAllCustomerVo[]
     */
    List<FindAllCustomerVo> findAll();

    /**
     * update
     *
     * @param entity CustomerEntity
     */
    void updateCustomer(CustomerEntity entity);

    /**
     * delete
     *
     * @param customerId Long
     */
    void deleteCustomer(Long customerId);
}
