package com.lz.dao.impl;

import com.lz.dao.AccountDao;
import com.lz.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AccountDao")
public class AccountDaoimpl implements AccountDao {


    @Override
    public List<Account> findAll() {
        System.out.println("查询了所有用户");
        return null;
    }

    @Override
    public void save(Account account) {
        System.out.println("保存了所有用户");
    }
}
