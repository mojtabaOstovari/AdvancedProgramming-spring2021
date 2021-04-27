public class App {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread0 = new MyThread("Hello");
        MyThread thread1 = new MyThread("World");

        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();

        System.out.println(MyThread.count);

    }

}

class MyThread extends Thread {
    static int count = 0;
    String s;
    MyThread(String s){
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000 ; i++) {
            count = count + 1;
        }
    }
}
