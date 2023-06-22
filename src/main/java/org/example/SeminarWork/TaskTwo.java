package org.example.SeminarWork;

import java.util.LinkedList;
import java.util.Random;

/**Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.*/
public class TaskTwo {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList();
        Random random = new Random();
        extracted(integerLinkedList, random);
        System.out.println("integerLinkedList = " + integerLinkedList);
        int sum = getSum(integerLinkedList);
        System.out.println("sum = " + sum);
    }

    private static void extracted(LinkedList<Integer> integerLinkedList, Random random) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            integerLinkedList.add(random.nextInt(10));
        }
    }

    private static int getSum(LinkedList<Integer> integerLinkedList) {
        int  sum =0;
        for (int number: integerLinkedList) {
            if(number % 2 == 0) sum+= number;
        }
        return sum;
    }
}
