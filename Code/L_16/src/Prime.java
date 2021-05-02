public class Prime {
    public static void main(String[] args) throws InterruptedException {
        int n = 50000000;

//        int t = primeNumbers(n);
//
//        System.out.println("1: " + t);

        PThread[] threads = new PThread[PThread.TOTAL_CORE];
        for (int i = 0; i < PThread.TOTAL_CORE; i++) {
            threads[i] = new PThread(i, n);
            threads[i].start();
        }

        for (int i = 0; i < PThread.TOTAL_CORE; i++) {
            threads[i].join();
        }

        int total = 0;
        for (int i = 0; i < PThread.TOTAL_CORE; i++) {
            total+= threads[i].total;
        }

        System.out.println("2: " +total);

    }

    static boolean isPrime(int i){
        boolean flag = true;
        for (int j = 2; j <= Math.sqrt(i) ; j++) {
            if(i%j==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int primeNumbers(int n){
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}


class PThread extends Thread{
    static final int TOTAL_CORE = 15;
    int id;
    int n;
    int total = 0;

    public PThread(int id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = id; i <= n; i+=TOTAL_CORE) {
            if (Prime.isPrime(i)){
                total++;
            }
        }
    }
}
