// ����һ����ҳ��
package com.how2java.util;

public class Page {

    // ��ҳ��ʼλ�ã�Ĭ��Ϊ0
    int start=0;
    // ÿҳ��ʾ��������Ĭ��Ϊ5
    int count = 5;
    // ���һҳ����ʼλ�ã�Ĭ��Ϊ0
    int last = 0;
    
    // ��ȡ��ҳ��ʼλ��
    public int getStart() {
        return start;
    }
    
    // ���÷�ҳ��ʼλ��
    public void setStart(int start) {
        this.start = start;
    }
    
    // ��ȡÿҳ��ʾ������
    public int getCount() {
        return count;
    }
    
    // ����ÿҳ��ʾ������
    public void setCount(int count) {
        this.count = count;
    }
    
    // ��ȡ���һҳ����ʼλ��
    public int getLast() {
        return last;
    }
    
    // �������һҳ����ʼλ��
    public void setLast(int last) {
        this.last = last;
    }
    
    // �������һҳ����ʼλ��
    public void caculateLast(int total) {
        // ����������50�����ܹ���5�����ģ���ô���һҳ�Ŀ�ʼ����45
        if (0 == total % count)
            last = total - count;
        // ����������51�����ܹ���5�����ģ���ô���һҳ�Ŀ�ʼ����50
        else
            last = total - total % count;        
    }

}