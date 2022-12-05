package upr3;

import java.util.SortedMap;

public class Demo {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List: ");
        System.out.println(list);
        System.out.println("Popped element: ");
        System.out.println(list.pop());
        System.out.println("Popped list: ");
        System.out.println(list);
        System.out.println("Element under index 1: ");
        System.out.println(list.get(1));
        System.out.println("Size of list: ");
        System.out.println(list.size());
        System.out.println("Enumeration of elements: ");
        for(int num : list){
            System.out.println(num);
        }
    }

}
