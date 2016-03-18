package com.you.service;

import com.you.dao.Bank;
import com.you.dao.BankDao;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by zhiyou on 16-3-7.
 */
public class BankServlceimpl  {

    private BankDao bankDao;
    //编程式事物管理
  //   private TransactionTemplate transactionTemplate;

//    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//        this.transactionTemplate = transactionTemplate;
//    }


//    public BankDao getBankDao() {
//        this.transferAccounts(1,"2","3");
//        return bankDao;
//    }

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    public void transferAccounts( int money,  String bankA,  String bankB){
        bankDao.outMoney(money,bankB);
        bankDao.inMoney(money,bankA);
    }
//    public void transferAccounts(final int money, final String bankA, final String bankB){
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                bankDao.outMoney(money,bankB);
//                bankDao.inMoney(money,bankA);
//            }
//       });
//
//    }
}
