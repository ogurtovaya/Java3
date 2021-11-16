package Lesson1;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class ArrayMas {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(3);
        ArrayList<Integer> list2 = new ArrayList<>(3);
        list.add("собака");
        list.add("кот");
        list.add("гусь");

        list2.add(2);
        list2.add(5);
        list2.add(7);

        swap(list,0,1);
        swap(list2, 0,1);


        System.out.println(list);
        System.out.println(list2);













    }
}
