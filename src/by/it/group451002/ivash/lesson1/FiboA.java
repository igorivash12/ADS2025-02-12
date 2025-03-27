package by.it.group451002.ivash.lesson1;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {
    private long startTime = System.currentTimeMillis();

    public FiboA() {
    }

    public static void main(String[] args) {
        by.it.group451002.vysotski.lesson01.FiboA fibo = new by.it.group451002.vysotski.lesson01.FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());
        fibo = new by.it.group451002.vysotski.lesson01.FiboA();
        n = 34;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }

    private long time() {
        long res = System.currentTimeMillis() - this.startTime;
        this.startTime = System.currentTimeMillis();
        return res;
    }

    private int calc(int n) {
        int var10000;
        switch (n) {
            case 0 -> var10000 = 0;
            case 1 -> var10000 = 1;
            default -> var10000 = this.calc(n - 1) + this.calc(n - 2);
        }

        return var10000;
    }

    public BigInteger slowA(Integer n) {
        BigInteger var10000;
        switch (n) {
            case 0 -> var10000 = BigInteger.ZERO;
            case 1 -> var10000 = BigInteger.ONE;
            default -> var10000 = this.slowA(n - 1).add(this.slowA(n - 2));
        }

        return var10000;
    }
}
