package org.example.SeminarWork;

import java.util.Stack;
import java.util.StringJoiner;

/**
 Получив строку, которая являетсяабсолютным путем (начиная с косой черты) к файлу или каталогу
 в файловой системе в стиле Unix, преобразуйте ее в упрощенныйканонический путь.path'/'

 В файловой системе в стиле Unix точка относится к текущему каталогу,
 двойная точка относится к каталогу выше по уровню, а любые несколько последовательных косых черт
 (т.е.) рассматриваются как одна косая черта. Для этой проблемы любой другой формат точек,
 таких какрассматриваются как имена файлов/каталогов.'.''..''//''/''...'

 Канонический путьдолжен иметь следующий формат:

 Путь начинается с одной косой черты.'/'
 Любые два каталога разделяются одной косой чертой.'/'
 Путь не заканчивается трейлингом.'/'
 Путь содержит только каталоги по пути от корневого каталога к целевому файлу или каталогу (т. е. без точки или двойной точки'.''..')
 Вернитеупрощенныйканонический путь.

 Пример 1:

 Input: path = "/home/"
 Output: "/home"
 Explanation: Note that there is no trailing slash after the last directory name.
 Пример 2:

 Input: path = "/../"
 Output: "/"
 Explanation: Going one level up from the root directory is a no-op,
 as the root level is the highest level you can go.
 * */
public class TaskFive {
    public static void main(String[] args) {
        System.out.println("simplifyPath(\"/home/\") = " + simplifyPath("/home/"));
        System.out.println("simplifyPath(\"/../\") = " + simplifyPath("/../"));
        System.out.println("simplifyPath( \"/home//foo/\") = " + simplifyPath("/home//foo/"));
    }
    public static String simplifyPath(String path){
        Stack<String> stack =new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else if (!".".equals(s) && !s.isEmpty()) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) return "/";
        while (!stack.isEmpty()){
            res.insert(0, stack.pop()).insert(0,"/");
        }
        return res.toString();

    }
}
