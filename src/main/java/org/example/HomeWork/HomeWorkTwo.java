package org.example.HomeWork;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;

/**
 При наличии строки, содержащей только символы,,,,и,
 определите, является ли входная строка допустимой.s'('')''{''}''['']'
 Входная строка допустима, если:
 Открытые кронштейны должны быть закрыты кронштейнами того же типа.
 Открытые скобки должны быть закрыты в правильном порядке.
 Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
 Пример 1:
 Input: s = "()"
 Output: true
 Пример 2:
 Input: s = "()[]{}"
 Output: true
 Пример 3:
 Input: s = "(]"
 Output: false
 Ограничения целостности:
 1 <= s.length <= 104
 s состоит только из круглых скобок.'()[]{}'
 */

public class HomeWorkTwo {
    public static void main(String[] args) {
        String s = "[{{{{{{{{[[[[[[[]]]]]]]}}]}}}}}}";
        System.out.println("stringTrueFalse() = " + stringTrueFalseSteck(s));
        System.out.println("stringTrueFalseLinked() = " + stringTrueFalseLinked(s));
    }

    /**
     * @apiNote определяет, является ли входная строка допустимой.s'('')''{''}''['']'
     * Открытые кронштейны должны быть закрыты кронштейнами того же типа.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
     * @param s
     * @return
     */
    public static boolean stringTrueFalseSteck(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    /**
     * @apiNote определяет, является ли входная строка допустимой.s'('')''{''}''['']'
     * Открытые кронштейны должны быть закрыты кронштейнами того же типа.
     *  Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
     * @param s
     * @return
     */
    public static boolean stringTrueFalseLinked(String s) {
        LinkedHashSet<Character> roundBracket = new LinkedHashSet<>();
        LinkedHashSet<Character> curlyBracket = new LinkedHashSet<>();
        LinkedHashSet<Character> squareBracket = new LinkedHashSet<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == ')') roundBracket.add(ch);
            if (ch == '{' || ch == '}') curlyBracket.add(ch);
            if (ch == '[' || ch == ']') squareBracket.add(ch);
        }
        if (roundBracket.size() != 1 && squareBracket.size() != 1 && curlyBracket.size() != 1) return true;
        return false;
    }
}
