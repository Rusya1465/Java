import java.util.Scanner;

public class Number4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите двузначное число: ");
            int number = scanner.nextInt();

            if (number < 10 || number > 99) {
                System.out.println("Ошибка: число должно быть двузначным.");
                return;
            }

            int hundreds = number / 10;
            int units = number % 10;

            int reversedNumber = units * 10 + hundreds;

            int finalResult = reversedNumber + 8;

            System.out.println("Результат: " + finalResult);
        }
}
