package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;
 
public interface CategoryMapper {
 
    // 添加分类
    public int add(Category category);  
       
    // 删除分类
    public void delete(int id);  
       
    // 根据id获取分类
    public Category get(int id);  
     
    // 更新分类
    public int update(Category category);   
       
    // 获取所有分类列表
    public List<Category> list();
    
    // 分页获取分类列表
    public List<Category> list(Page page);
    
    // 获取分类总数
    public int total();  
    
}