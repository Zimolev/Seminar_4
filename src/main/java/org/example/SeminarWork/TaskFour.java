package org.example.SeminarWork;

import java.util.LinkedList;
import java.util.Random;

/**Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.*/
public class TaskFour {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList();
        Random random = new Random();
        extracted(integerLinkedList, random);
        System.out.println("integerLinkedList = " + integerLinkedList);

        extractedDelTwo(integerLinkedList);
        System.out.println("integerLinkedList = " + integerLinkedList);
    }

    private static void extractedDel(LinkedList<Integer> integerLinkedList) {
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if (integerLinkedList.get(i) < 0){
                integerLinkedList.remove(i);
                i--;
            }
        }
    }
    private static void extractedDelTwo(LinkedList<Integer> integerLinkedList) {
        for (int i = integerLinkedList.size()-1; i >= 0; i--) {
            if (integerLinkedList.get(i) < 0){
                integerLinkedList.remove(i);
            }
        }
    }

    private static void extracted(LinkedList<Integer> integerLinkedList, Random random) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            integerLinkedList.add(random.nextInt(-10, 11));
        }
    }

}
