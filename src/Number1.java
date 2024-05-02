import java.util.Scanner;

public class Number1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите трехзначное число: ");
            int number = scanner.nextInt();

            if (number < 100 || number > 999) {
                System.out.println("Ошибка: число должно быть трехзначным.");
                return;
            }

            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;

            int middleNumber = number - hundreds - units;

            System.out.println("Результат: " + middleNumber + " " + tens + " " + hundreds);
        }
}
