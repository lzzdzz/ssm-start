package com.lz.service.impl;

import com.lz.dao.AccountDao;
import com.lz.domain.Account;
import com.lz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("查询所有");
        return accountDao.findAll();
    }

    public void save(Account account) {
        System.out.println("保存了");
        accountDao.save(account);
    }
}
