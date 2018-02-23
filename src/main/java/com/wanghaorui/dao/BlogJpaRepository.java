package com.wanghaorui.dao;

import com.wanghaorui.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wangfei on 2018/2/13.
 */
public interface BlogJpaRepository extends CrudRepository<Blog,String> {

}
