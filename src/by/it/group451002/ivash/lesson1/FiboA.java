package by.it.group451002.ivash.lesson1;

import java.math.BigInteger;

public class FiboA {
    private long startTime = System.currentTimeMillis();

    public FiboA() {
    }

    public static void main(String[] args) {
        int n = 33;
        n = 34;
    }

    private long time() {
        long res = System.currentTimeMillis() - this.startTime;
        this.startTime = System.currentTimeMillis();
        return res;
    }

    private int calc(int n) {
    }

    public BigInteger slowA(Integer n) {
    }
}