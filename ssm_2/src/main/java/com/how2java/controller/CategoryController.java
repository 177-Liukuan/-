// ������Ҫ����
package com.how2java.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

// ����һ��Spring MVC��������
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	// �������󣬷���ģ�ͺ���ͼ����
	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
	
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list(page);
		
		int total = categoryService.total();
		
		page.caculateLast(total);
		
		// ��Ӳ���
		mav.addObject("cs", cs);
		// ������ͼ����
		mav.setViewName("listCategory");
		return mav;
	}
	
	// ������ӷ��������
	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category){
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
	    return mav;
	}	
	
	// ����ɾ�����������
	@RequestMapping("myDeleteTest")
	public ModelAndView deleteCategory(Category category){
		categoryService.delete(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}	
	
	// ����༭���������
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category){
		Category c= categoryService.get(category.getId());
		ModelAndView mav = new ModelAndView("editCategory");
		mav.addObject("c", c);
		return mav;
	}	
	
	// ������·��������
	@RequestMapping("updateCategory")
	public ModelAndView updateCategory(Category category){
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}	

}
