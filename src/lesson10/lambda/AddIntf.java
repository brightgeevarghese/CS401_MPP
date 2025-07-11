package lesson10.lambda;

@FunctionalInterface
public interface AddIntf {
    int add(int a, int b);
//    int sub(int a, int b);//code breaks -> compile time error
    default int add(int a, int b, int c) {
        return a + b + c;
    }
    private void f1() {}
    @Override
    public String toString();
    static void f2(){}
}
