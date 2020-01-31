package com.lz.dao;

import com.lz.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    //查询所有
    @Select("select * from account")
    public List<Account> findAll();
    //保存
    @Insert("insert into account(name,money) values(#{name},#{money});")
    public void save(Account account);
}
