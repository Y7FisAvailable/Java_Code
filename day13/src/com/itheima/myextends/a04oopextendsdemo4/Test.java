package com.itheima.myextends.a04oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        HaShiQ h = new HaShiQ();
        h.chiFan();
        h.heShui();
        h.chaiJia();

        System.out.println("---------");

        TianYuan t = new TianYuan();
        t.chiFan();
        t.heShui();
        t.kanJia();
    }
}

class Dogs {
    public void chiFan() {
        System.out.println("在吃饭，吃狗粮");
    }
    public void heShui() {
        System.out.println("喝水");
    }
    public void kanJia() {
        System.out.println("看家");
    }
}

class HaShiQ extends Dogs {
    public void chaiJia() {
        System.out.println("哈士奇在拆家");
    }
}

class ShaPi extends Dogs {
    @Override
    public void chiFan() {
        super.chiFan();
        System.out.println("在吃饭，吃骨头");
    }
}

class TianYuan extends Dogs {
    @Override
    public void chiFan() {
        System.out.println("在吃饭，吃剩饭");
    }
}