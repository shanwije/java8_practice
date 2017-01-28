package lamda;

/**
 * Created by shan on 1/28/17.
 */
public class Main {
    public static void main(String[] args) {
        new CreateLamda().sayHello("Shan", (String s) -> {
            System.out.println("Hello ," + s);
        });

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("hey guys");
            }
        });

        t.start();
        new Main().myThread(() -> System.out.println("hello from lambda"));

    }

    public void myThread(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }
}
