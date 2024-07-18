package com.itheima.search;

public class A03_BlockSearchDemo_3 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        //2.创建类的对象
        Block3 b1 = new Block3(22, 40, 0, 4);
        Block3 b2 = new Block3(13, 20, 5, 8);
        Block3 b3 = new Block3(7, 10, 9, 10);
        Block3 b4 = new Block3(43, 50, 11, 13);

        //3.对象封装数组
        Block3[] block3Arr = {b1, b2, b3, b4};

        //4.查找对象
        int num = 7;

        //7.调用
        System.out.println(getIndex(block3Arr, num, arr));

    }


    //6.通过min~max范围获取了block的索引,取出start和end
    public static int getIndex(Block3[] block3Arr, int num, int[] arr) {
        int blockIndex = getBlockIndex(block3Arr, num);

        if(blockIndex == -1){
            return -1;
        }

        int startIndex = block3Arr[blockIndex].getStartIndex();
        int endIndex = block3Arr[blockIndex].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }


    //5.查找num在哪个block内？
    public static int getBlockIndex(Block3[] block3Arr, int num) {
        //5.1遍历数组blockArr
        for (int i = 0; i < block3Arr.length; i++) {
            int min = block3Arr[i].getMin();
            int max = block3Arr[i].getMax();//获取max min范围
            if (num >= min && num <= max) {
                return i;//在范围内
            }
        }
        //如果遍历完都不在
        return -1;
    }
}


//1.定义类block
class Block3 {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public Block3() {
    }

    public Block3(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
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
        return "Block3{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}