package com.aop.demo.appDao;

import com.aop.demo.appDao.FruitDAO;
import org.springframework.stereotype.Repository;

@Repository
public class FruitDAOImpl implements FruitDAO {
    @Override
    public void addFruit() {
        System.out.println("Hi from addFruit method");
        System.out.println("Here will be the logic of adding fruit into db...");
    }
}
