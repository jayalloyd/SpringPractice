package com.meenus;

public class Alien {
    private int age;

    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        lap.compute();
        System.out.println("coding..compiling");
    }
}
