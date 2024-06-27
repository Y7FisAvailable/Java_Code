package com.itheima.a06interfacedemo4;

public class Test {
    public static void main(String[] args) {
        PingPanger per = new PingPanger("张学员",18);
        per.study();
        per.speakEnglish();

        PingPangCoach pc = new PingPangCoach("王教练",33);
        pc.teach();
        pc.speakEnglish();

        LanQiuer ler = new LanQiuer("李学员",15);

        LanQiuCoach lc = new LanQiuCoach("处教练",55);
    }
}
