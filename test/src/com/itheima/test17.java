package com.itheima;

public class test17 {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */

        //1.先给arr分块
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //3.创建Block类的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //4.定义blockArr数组，存储对象
        Block[] blockArr = {b1, b2, b3};

        //5.查找的数据
        int number = 9;


        //9.调用方法，返回索引
        System.out.println(getIndex(blockArr, arr, number));


    }

    //6.定义方法，遍历blockArr找到number在哪个范围内
    public static int getBlockIndex(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            //如果number小于blockArr数组的i元素中的最大值Max
            if (number < blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

    //8.遍历start ~ end范围找到元素索引
    public static int getIndex(Block[] blockArr, int[] arr, int number) {
        int blockIndex = getBlockIndex(blockArr, number);

        if(blockIndex == -1){
            return -1;
        }

        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
}

//2.定义block类
class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
