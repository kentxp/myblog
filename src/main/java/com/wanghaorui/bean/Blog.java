package com.wanghaorui.bean;

import javax.persistence.*;

/**
 * Created by wangfei on 2018/2/13.
 */
@Entity
@Table(name = "t_blog")
public class Blog {
    @Id
    @Column(name = "blog_id")
    String blogId;
    @Column(name = "blog_name")
    String blogName;
    @Column(name = "blog_desc")
    String blogDesc;


    public String getBlogId() {
        return blogId;
    }
    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogDesc() {
        return blogDesc;
    }

    public void setBlogDesc(String blogDesc) {
        this.blogDesc = blogDesc;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId='" + blogId + '\'' +
                ", blogName='" + blogName + '\'' +
                ", blogDesc='" + blogDesc + '\'' +
                '}';
    }
}
