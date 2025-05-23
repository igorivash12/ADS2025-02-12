//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package by.it.group451002.vysotski.lesson01;

public class FiboC {
    private long startTime = System.currentTimeMillis();

    public FiboC() {
    }

    public static void main(String[] args) {
        FiboC fibo = new FiboC();
        int n = 55555;
        int m = 1000;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC((long)n, m), fibo.time());
    }

    public long time() {
        return System.currentTimeMillis() - this.startTime;
    }

    public long fasterC(long n, int m) {
        if (n == 0L) {
            return 0L;
        } else if (n == 1L) {
            return 1L;
        } else {
            int prev = 0;
            int curr = 1;
            int period = 0;

            for(int i = 0; i < m * m; ++i) {
                int temp = (prev + curr) % m;
                prev = curr;
                curr = temp;
                if (prev == 0 && temp == 1) {
                    period = i + 1;
                    break;
                }
            }

            n %= (long)period;
            prev = 0;
            curr = 1;

            for(int i = 2; (long)i <= n; ++i) {
                int temp = (prev + curr) % m;
                prev = curr;
                curr = temp;
            }

            return (long)curr;
        }
    }
}


