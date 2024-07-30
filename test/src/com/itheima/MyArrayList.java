package com.itheima;

import java.util.Arrays;

public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    public MyArrayList() {
    }

    public MyArrayList(Object[] obj) {
        this.obj = obj;
    }

    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public boolean delete(E e) {//通过元素删除
        for (int i = 0; i < obj.length; i++) {
            if (e.equals(obj[i])) {
                obj[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean delete(int index) {//通过index删除
        if (index < 0 || index >= obj.length) {
            return false;
        }

        obj[index] = null;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
