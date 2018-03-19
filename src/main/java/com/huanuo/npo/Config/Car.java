package com.huanuo.npo.Config;

public class Car {

    String fangxiangpan;
    String lunzi;
    String happy;


    public void Run() {
        System.out.println("run");
    }

    public Car(String fangxiangpan, String lunzi, String happy) {
        this.fangxiangpan = fangxiangpan;
        this.lunzi = lunzi;
        this.happy = happy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fangxiangpan='" + fangxiangpan + '\'' +
                ", lunzi='" + lunzi + '\'' +
                ", happy='" + happy + '\'' +
                '}';
    }
}
