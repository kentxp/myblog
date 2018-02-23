package com.wanghaorui.controller;

import com.wanghaorui.bean.Blog;
import com.wanghaorui.dao.BlogJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangfei on 2018/2/13.
 */
@RestController
public class TestController {

    @Autowired
    BlogJpaRepository blogJpaRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Iterable<Blog> getAccounts() {
        return blogJpaRepository.findAll();
    }


}
