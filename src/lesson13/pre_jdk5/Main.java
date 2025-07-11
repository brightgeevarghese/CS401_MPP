package lesson13.pre_jdk5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //How the list was created before JDK1.5?//looks like hetrogeneous collection
        List list = new ArrayList();
        list.add("Tom");//String obj
        list.add(10);//Integer obj
        list.add(true);//Boolean
        System.out.println(list);
        //access the first data and store it in a variable
        String name = (String)list.get(0);
        int age = (Integer) list.get(1);
        boolean isMale = (Boolean) list.get(2);
    }
}
