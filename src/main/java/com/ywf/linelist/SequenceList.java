package com.ywf.linelist;

import com.ywf.entrys.Student;

/**
 * ClassName SequenceList
 * 功能: 顺序表  add有序
 * Author yangweifeng
 * Date 2019-07-14 17:15
 * Version 1.0
 **/
public class SequenceList implements LineListInterface{
    // 默认顺序表的最大长度
    final int defaultSize = 10;
    // 最大长度
    int maxSize;
    // 当前长度
    int size;
    // 对象数组
    Object[] listArray;

    public SequenceList(){
         init(defaultSize);
    }
    public SequenceList(int parm_size){
         init(parm_size);
    }
    // 顺序表初始化方法
    private void init(int parm_size) {
        maxSize = parm_size;
        this.size = 0;
        listArray = new Object[maxSize];
    }

    @Override
    public int Size() {
        return size;
    }

    @Override
    public Boolean IsEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {
        if (size == maxSize){
           // 线性表已满
            throw new Exception("顺序表长度:" + size + ",顺序表已满,无法插入。");
        }
        if (index < 0 || index > size - 1){
            throw new Exception("index参数位置非法");
        }
        // 移动元素
        for (int i = size; i > index ; i--) {
            listArray[i] = listArray[i - 1];
        }
        // 插入值
        listArray[index] = obj;
        size++;
    }

    /**
     * 默认在默认插入
     * @param obj 对象
     * @throws Exception 异常
     */
    @Override
    public void add(Object obj) throws Exception {
        listArray[size] = obj;
        size++;
    }

    @Override
    public void delete(int index) throws Exception {
         if (IsEmpty()){
             throw new Exception("顺序表为空");
         }
         if (index < 0 || index > size - 1){
             throw new Exception("index参数位置非法");
         }
        // 移动元素 最后一位不需要移动
        for (int i = index; i < size - 1 ; i++) {
            listArray[i] = listArray[i + 1];
        }
        size--;
    }
    @Override
    public Object get(int index) throws Exception {
        if (index < 0 || index > size - 1){
            throw new Exception("index参数位置非法");
        }
        return listArray[index];
    }

    public static void main(String[] args) {
        SequenceList sequenceList = new SequenceList(100);
        try {
            for (int i = 0; i < 99; i++) {
                sequenceList.add(new Student(i,"111","111",i));
            }
            sequenceList.insert(5,new Student(5,"jjjf","rrr",9999));
            for (int i = 0; i < sequenceList.size; i++) {
                System.out.println(sequenceList.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
