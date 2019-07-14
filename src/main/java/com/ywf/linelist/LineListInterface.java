package com.ywf.linelist;

/**
 * ClassName LineListInterface
 * 功能: 自定义线性表
 *
 * @Author yangweifeng
 * @Date 2019-07-14 17:02
 * @Version 1.0
 **/
public interface LineListInterface {
     public int Size();  // 获取线性表长度
     public Boolean IsEmpty();// 判断线性表是否为空
     public void insert(int index,Object obj) throws  Exception; //插入元素
     public void add(Object obj) throws  Exception; //插入元素
     public void delete(int index) throws  Exception; //删除元素
     public Object get(int index) throws  Exception; //获取指定位置元素
}
