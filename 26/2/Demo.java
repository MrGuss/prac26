package upr2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MyIterator<Integer> iterator = new MyIterator<Integer>(list);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
