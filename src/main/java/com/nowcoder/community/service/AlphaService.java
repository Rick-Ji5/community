package com.nowcoder.community.service;


import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


// 服务注解
@Service
//@Scope("prototype")
//管理作用域范围

public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化 AlphaService");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化 AlphaService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁 AlphaService");
    }


    public String find() {
         return alphaDao.select();
    }
}
