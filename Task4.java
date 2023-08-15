import java.util.Objects;
import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) {
        String name = setString();
    }
    public static String setString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        if (string.equals("")){
            throw new RuntimeException ("Нельзя ввести пустую строку");
        }
        return string;
    }
}
