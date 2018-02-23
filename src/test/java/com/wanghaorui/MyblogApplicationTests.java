package com.wanghaorui;

import com.wanghaorui.dao.BlogJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyblogApplicationTests {

	@Autowired
	private BlogJpaRepository blogJpaRepository;

	@Test
	public void contextLoads() {

		System.out.println(blogJpaRepository.findOne("1"));
	}

}
