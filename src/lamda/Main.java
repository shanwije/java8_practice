package lamda;

/**
 * Created by shan on 1/28/17.
 */
public class Main {
    public static void main(String[] args) {
        new CreateLamda().sayHello("Shan", (String s) -> {
            System.out.println("Hello ," + s);
        });

        Greetable gg = new Main()::printsome;

        gg.greet("XXXXXX");
        new Main().myThread(() -> System.out.println("hello from lambda"));


    }

    public void myThread(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }

    public void printsome(String s) {
        System.out.println(s);
    }
}
