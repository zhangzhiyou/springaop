package com.you.dao;

/**
 * Created by zhiyou on 16-3-7.
 */
public interface BankDao {
    public void inMoney(int count,String bankId);
    public void outMoney(int count,String bankId);
}
