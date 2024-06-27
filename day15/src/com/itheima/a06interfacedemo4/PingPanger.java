package com.itheima.a06interfacedemo4;

public class PingPanger extends Athlete implements SpeakEnglish{
    public PingPanger() {
    }

    public PingPanger(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
