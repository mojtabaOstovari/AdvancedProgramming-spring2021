import javax.print.attribute.HashDocAttributeSet;

public class T {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(100);
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                System.out.println("hi");
            }
        });

        t.start();

        t.interrupt();

    }
}
