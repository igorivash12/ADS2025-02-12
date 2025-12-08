package by.it.group451002.ivash.lesson1;

import java.math.BigInteger;

public class FiboA {
    private long startTime = System.currentTimeMillis();

    public FiboA() {
    }

    public static void main(String[] args) {
        FiboA fib = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fib.calc(n), fib.time());
        n = 34;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fib.slowA(n), fib.time());
    }

    private long time() {
        long res = System.currentTimeMillis() - this.startTime;
        this.startTime = System.currentTimeMillis();
        return res;
    }

    private int calc(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> calc(n - 1) + calc(n - 2);
        };
    }

    public BigInteger slowA(Integer n) {
        return switch (n) {
            case 0 -> BigInteger.ZERO;
            case 1 -> BigInteger.ONE;
            default -> slowA(n - 1).add(slowA(n - 2));
        };
    }
}