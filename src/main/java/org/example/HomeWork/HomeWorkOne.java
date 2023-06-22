package org.example.HomeWork;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Random;

/**
 Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 Пример:
 1 -> 2->3->4
 Вывод:
 4->3->2->1
 */
public class HomeWorkOne {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList();
        Random random = new Random();
        createdLinkedList(integerLinkedList, random);
        System.out.println("integerLinkedList = " + integerLinkedList);
        collectionsReversLinkedList(integerLinkedList);
        System.out.println("integerLinkedListRevers = " + integerLinkedList);
        System.out.println("reverseLinkedList(integerLinkedList) = " + reverseLinkedList(integerLinkedList));

        iteratorReversLinkedList(reverseLinkedList(integerLinkedList));


    }

    /**
     * @apiNote перезаписыват исходный список в перевернутом виде
     * @param integerLinkedList
     */
    private static void collectionsReversLinkedList(LinkedList<Integer> integerLinkedList) {
        Collections.reverse(integerLinkedList);
    }

    /**
     * @apiNote Выводит список на экран в перевернутом виде
     * @param integerLinkedList
     */
    private static void iteratorReversLinkedList(LinkedList<Integer> integerLinkedList) {
        Iterator<Integer> iterator = integerLinkedList.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + ", ");
        }
    }

    /**
     * @apiNote Заполняет LinkedList случайными значениями от 1 до 9
     * @param integerLinkedList
     * @param random
     */
    public static void createdLinkedList(LinkedList<Integer> integerLinkedList, Random random) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            integerLinkedList.add(random.nextInt(10));
        }
    }

    /**
     * @apiNote Возвращает список в перевернутом виде
     * @param integerLinkedList
     * @return LinkedList
     */
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> integerLinkedList)
    {
        LinkedList<Integer> integerLinkedListRevers = new LinkedList<>();
        for (int i = integerLinkedList.size() - 1; i >= 0; i--) {
            integerLinkedListRevers.add(integerLinkedList.get(i));
        }
        return integerLinkedListRevers;
    }
}
