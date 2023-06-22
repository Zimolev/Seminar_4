package org.example.SeminarWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 2. Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(random.nextInt(10));
        }
        System.out.println(integerLinkedList);
        scanner.close();
        System.out.println("integerLinkedList.peek() = " + integerLinkedList.peek());
        System.out.println("integerLinkedList = " + integerLinkedList);
        System.out.println("integerLinkedList.pop() = " + integerLinkedList.pop());
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.addLast(10);
        integerLinkedList.addFirst(0);
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.remove((Integer) 3);
        System.out.println("integerLinkedList = " + integerLinkedList);
    }

}
