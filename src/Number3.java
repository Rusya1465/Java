import java.util.Scanner;
public class Number3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите 3-значное число: ");
            int number = scanner.nextInt();

            if (number < 100 || number > 999) {
                System.out.println("Ошибка: число должно быть 3-значным.");
                return;
            }

            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;

            int sum = hundreds * 100 + tens * 10 + units;

            System.out.println(hundreds + "00 + " + tens + "0 + " + units + " = " + sum);
        }

}
