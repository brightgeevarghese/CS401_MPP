package lesson9.exercise1;

public interface StringList {
    String[] strArray();
    int size();
    void incrementSize();
    //change the following two methods to default
//    public void add(String str);
//    public String get(int index);
    public default void add(String str) {
        //Add a string to the end of the list, strArray
        strArray()[size()] = str;//if size is 5, strArray[5]
        incrementSize();
    }

    public default String get(int index) {
        //check the index value(index >= 0 and index < size of strArray)
        //...
        return strArray()[index];
    }
}
