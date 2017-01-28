package util_.Funtion;

import java.util.function.Function;

/**
 * Created by shan on 1/28/17.
 */
public class Main {
    public static void main(String[] args) {
        Function<String, Person> myFunc;
        myFunc = (String s) -> new Person(s);
        Person p = myFunc.apply("Shan");
        System.out.println(p.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
