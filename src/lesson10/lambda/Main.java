package lesson10.lambda;

public class Main {
    public static void main(String[] args) {
        //new anonymous class which implements AddIntf
        AddIntf ob = new AddIntf() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(ob.add(1, 2));//3
        //lambda expression
        AddIntf ob2 = (a, b) -> a + b;
        System.out.println(ob2.add(1, 2));
        //Another equivalent lambda expression
        AddIntf ob3 = (a, b) -> {
            //....
            return a + b;
        };
        System.out.println(ob3.add(1, 2));
        AddIntf ob4 = (a, b) -> {
            return a + b;
        };

    }
}
