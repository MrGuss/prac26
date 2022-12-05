package upr1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> test = new Stack<Integer>();

        System.out.println("Give me amount of numbers: ");
        int amount = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter numbers divided by lines");
        for (int i=0; i<amount;i++){
            test.add(Integer.valueOf(scanner.nextLine()));
        }
        System.out.println("Input array: ");
        System.out.println(test);
        for (int i=0; i<(amount/2); i++){
            test.add(i, test.remove(amount-i-1));
            test.add(amount-i-1, test.remove(i+1));
        }
        System.out.println("Reversed array: ");
        System.out.println(test);
    }
}
