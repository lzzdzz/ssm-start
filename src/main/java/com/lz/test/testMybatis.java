package com.lz.test;

import com.lz.dao.AccountDao;
import com.lz.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;




public class testMybatis {
    @Test
    public void test1()throws Exception{
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SQLSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SQL session对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> list = accountDao.findAll();
        for (Account account:list) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }
    @Test
    public void testSave()throws Exception{
        Account account1 = new Account();
        account1.setName("小猪");
        account1.setMoney(60000.00);
        //加载配置文件
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SQLSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SQL session对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //查询所有数据
        accountDao.save(account1);

        sqlSession.commit();

        sqlSession.close();
        in.close();
    }

}
