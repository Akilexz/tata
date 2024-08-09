package com.ec.tata.account.repositories;

import com.ec.tata.account.vo.account.FindAllAccountVo;
import com.ec.tata.bank.entities.AccountEntity;
import com.ec.tata.common.repositories.IQueryDslBaseRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for account resources
 *
 * @author Joel Castro
 * @version 1.0
 */
public interface IAccountRepository extends IQueryDslBaseRepository<AccountEntity> {
    /**
     * find all account
     *
     * @return PersonCategoryVo[]
     */
    List<FindAllAccountVo> findAll();

    /**
     * update
     *
     * @param accountEntity AccountEntity
     */
    void updateAccount(AccountEntity accountEntity);

    /**
     * delete
     *
     * @param accountId Long
     */
    void deleteAccount(Long accountId);

    /**
     * find by account id and amount
     *
     * @param accountId Long
     * @param amount Integer
     */
    Optional<AccountEntity> checkIfThereIsMoneyRequired(Long accountId, Integer amount);

    /**
     * find by account id
     *
     * @param accountId Long
     */
    Optional<AccountEntity> findByAccountId(Long accountId);
}
