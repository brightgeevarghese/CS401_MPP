package lesson10.functional_interface;

import java.util.ArrayList;
import java.util.List;

public class ListInfo {
    private List<Integer> list = new ArrayList<>();

    public  void addNumber(Integer x) {
        list.add(x);
    }

    public int getSize(){
        return list.size();
    }

    public List<Integer> getList() {
        return list;
    }

    //...
}
