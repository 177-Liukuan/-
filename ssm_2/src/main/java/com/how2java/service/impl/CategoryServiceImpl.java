package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}


	public List<Category> list(Page page) {
		// TODO Auto-generated method stub
		return categoryMapper.list(page);
	}


	public int total() {
		return categoryMapper.total();
	}


	public void add(Category c) {
		categoryMapper.add(c);
		
	}


	public void update(Category c) {
		categoryMapper.update(c);
	}


	public void delete(Category c) {
		categoryMapper.delete(c.getId());
	}


	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryMapper.get(id);
	};

}
