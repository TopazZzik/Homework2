/**Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).*/
package Hw2;

import static java.awt.SystemColor.text;

public class TaskOne {
    public static void main(String[] args) {
        System.out.print(isPalindrome("Live not on evil "));
    }
    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }
}
