package com.ec.tata.transaction.services;

import com.ec.tata.account.vo.account.CreateAccountVo;
import com.ec.tata.account.vo.account.FindAllAccountVo;
import com.ec.tata.account.vo.account.UpdateAccountVo;
import com.ec.tata.account.vo.transaction.CreateBankTransactionVo;
import com.ec.tata.account.vo.transaction.FindAllBankTransactionVo;
import com.ec.tata.account.vo.transaction.FindReportVo;
import com.ec.tata.account.vo.transaction.UpdateBankTransactionVo;
import com.ec.tata.bank.entities.AccountEntity;
import com.ec.tata.bank.entities.BankTransactionEntity;

import java.util.Date;
import java.util.List;

/**
 * Service interface for bank transaction resources
 *
 * @author Joel Castro
 * @version 1.0
 */
public interface IBankTransactionService {
    /**
     * find all bank transaction
     *
     * @return FindAllBankTransactionVo[]
     */
    List<FindAllBankTransactionVo> findAll();

    /**
     * create bank transaction entity
     *
     * @param bankTransactionEntity BankTransactionEntity
     */
    void createEntity(BankTransactionEntity bankTransactionEntity);

    /**
     * create bank transaction
     *
     * @param createBankTransactionVo CreateBankTransactionVo
     */
    void create(CreateBankTransactionVo createBankTransactionVo);

    /**
     * update account entity
     *
     * @param bankTransactionEntity BankTransactionEntity
     */
    void updateEntity(BankTransactionEntity bankTransactionEntity);

    /**
     * update account
     *
     * @param updateBankTransactionVo UpdateBankTransactionVo
     */
    void update(UpdateBankTransactionVo updateBankTransactionVo);

    /**
     * delete bank transaction
     *
     * @param bankTransactionId Long
     */
    void delete(Long bankTransactionId);

    List<FindReportVo> findReport(Date initialDate, Date endDate);
}
