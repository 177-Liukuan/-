package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;
 
public interface CategoryMapper {
 
    // ��ӷ���
    public int add(Category category);  
       
    // ɾ������
    public void delete(int id);  
       
    // ����id��ȡ����
    public Category get(int id);  
     
    // ���·���
    public int update(Category category);   
       
    // ��ȡ���з����б�
    public List<Category> list();
    
    // ��ҳ��ȡ�����б�
    public List<Category> list(Page page);
    
    // ��ȡ��������
    public int total();  
    
}