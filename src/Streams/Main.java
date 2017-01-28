package Streams;

import java.util.*;

/**
 * Created by shan on 1/28/17.
 */
public class Main {

    static int[] arr = {354, 5, 345, 3, 677, 5, 4, 43, 4327, 6, 7, 454, 34, 234, 54, 767, 67, 4323, 12, 443, 25, 546, 537};
    static List<Integer> l = new ArrayList<>();

    public static void main(String[] args) {
        for (int i : arr) {
            l.add(i);
        }

        l.stream().forEach(System.out::print);
        //System.out.println(l);
    }


}
