package com.how2java.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.util.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private CategoryMapper categoryMapper;

	// ≤‚ ‘ÃÌº”∑÷¿‡
	@Test
	public void testAdd() {
		for (int i = 0; i < 100; i++) {
			Category category = new Category();
			category.setId(i);
			category.setName(" Category"+i);
			categoryMapper.add(category);
		}

	}

	

}