package lambda;

/**
 * Created by shan on 1/28/17.
 */
public class Main {
    private String name;

    public Main(String name) {
        super();
        this.name = name;
    }

    public Main() {
        this("default");
    }

    public static void main(String[] args) {
        new CreateLambda().sayHello("Shan", (String s) -> {
            System.out.println("Hello ," + s);
        });
        Main m = new Main("ZZobject");
        Greetable ww = Main::printS;
        Greetable zz = m::printsome;
        Greetable gg = new Main()::printsome;

        gg.greet("XXXXXX");
        zz.greet("YYYYYY");
        ww.greet("ZZZZZZ");
        new Main().myThread(() -> System.out.println("hello from lambda"));


    }

    public void myThread(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }

    public void printsome(String s) {
        System.out.println(name + " " + s);
    }

    public static void printS(String s) {
        System.out.println("from static " + s);
    }
}
