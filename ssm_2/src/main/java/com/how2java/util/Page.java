// 定义一个分页类
package com.how2java.util;

public class Page {

    // 分页起始位置，默认为0
    int start=0;
    // 每页显示的数量，默认为5
    int count = 5;
    // 最后一页的起始位置，默认为0
    int last = 0;
    
    // 获取分页起始位置
    public int getStart() {
        return start;
    }
    
    // 设置分页起始位置
    public void setStart(int start) {
        this.start = start;
    }
    
    // 获取每页显示的数量
    public int getCount() {
        return count;
    }
    
    // 设置每页显示的数量
    public void setCount(int count) {
        this.count = count;
    }
    
    // 获取最后一页的起始位置
    public int getLast() {
        return last;
    }
    
    // 设置最后一页的起始位置
    public void setLast(int last) {
        this.last = last;
    }
    
    // 计算最后一页的起始位置
    public void caculateLast(int total) {
        // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
        if (0 == total % count)
            last = total - count;
        // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
        else
            last = total - total % count;        
    }

}