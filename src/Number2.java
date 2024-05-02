import java.util.Scanner;
public class Number2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите 2-значное число: ");
            int number = scanner.nextInt();

            if (number < 10 || number > 99) {
                System.out.println("Ошибка: число должно быть 2-значным.");
                return;
            }

            int tens = number / 10;
            int units = number % 10;

            int sum = tens * 10 + units;

            System.out.println(tens + "0 + " + units + " = " + sum);
        }
}
