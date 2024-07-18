package com.itheima.search;

public class A03_BlockSearchDemo_2 {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可

            int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};

            //数组长度为18，开18的根号，大概分4块，每块4-5个数据
            int[] arr = {16, 5, 9, 12, 21, 18,   --- 0-5
                        32, 23, 37, 26, 45, 34,  --- 6-11
                        50, 48, 61, 52, 73, 66}; --- 12-17
        */
        int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};

        //2.创建块对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //3.块对象封装数组
        Block[] blockArr = {b1, b2, b3};

        //4.要查找的数据
        int num = 37;

        //7.返回num在arr的索引
        System.out.println(getIndex(blockArr, num, arr));

    }


    //6.获得块索引后，遍历块中元素，获取元素在数组中的索引
    public static int getIndex(Block[] blockArr, int num, int[] arr) {
        //6.1调用getBlockIndex方法,获取块索引
        int blockIndex = getBlockIndex(blockArr, num);

        //6.2表示number不在数组当中
        if (blockIndex == -1) {
            return -1;
        }

        //6.3获取块索引对应块block[i]，取出startIndex、endIndex
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        //6.4遍历arr中startIndex ~ endIndex索引的元素
        for (int i = startIndex; i <= endIndex; i++) {
            if (num == arr[i]) {
                //说明找到了
                return i;
            }
        }
        //说明num在block范围内，但是不在arr中
        //比如arr =  {1，3，4，5，6}
        //block1 = {1，3}
        //block2 = {4，5，6}
        //2在块中有范围，在arr中不存在
        return -1;
    }


    //5.看数据num在哪个块？得到块索引
    //num>最后一个max，数据不在块中，num<max，数据在块中
    public static int getBlockIndex(Block[] blockArr, int num) {
        //5.1遍历blockArr
        for (int i = 0; i < blockArr.length; i++) {
            if (num <= blockArr[i].getMax()) {
                return i;//返回块的索引i
            }
        }
        //遍历结束都没找到，说明num不在数组内
        return -1;
    }
}


//1.创建块类
//这里用的还是A03_BlockSearchDemo.java的Block类
class Block2 {
    private int max;//块中最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引

    //1.1PTG生成标准JavaBean
    public Block2() {
    }

    public Block2(int max, int startIndex, int endIndex) {
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
        return "Block2{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}