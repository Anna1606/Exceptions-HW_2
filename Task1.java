import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        setFloatNumber();
    }

    public static Float setFloatNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        float number = 0;
            if (scanner.hasNextFloat()){
                number = scanner.nextFloat();
            } else {
                System.out.println("Некорректные данные, попробуйте ещё раз");
                setFloatNumber();
            }
        return number;
    }
}
