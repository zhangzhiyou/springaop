package com.you.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 * Created by zhiyou on 16-3-7.
 */
public class BankImpDao implements BankDao {
    private SimpleJdbcTemplate jdbcTemplate;

    public SimpleJdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void inMoney(int count,String bankId) {
        String sql = "update banks set bankmoney=bankmoney+"+count+" where bankeId =?";
        jdbcTemplate.update(sql,bankId);
    }

    @Override
    public void outMoney(int count,String bankId) {
        String sql ="update bank set bankmoney=bankmoney-"+count+" where bankeId=?";
        jdbcTemplate.update(sql,bankId);
    }
}
