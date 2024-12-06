package TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger firstNumber = new BigInteger(scanner.nextLine()); //много голямо число
        BigInteger secondNumber = new BigInteger(scanner.nextLine()); //цифра

        System.out.println(firstNumber.multiply(secondNumber)); //умножение
        //System.out.println(firstNumber.add(secondNumber)); //събиране
        //System.out.println(firstNumber.subtract(secondNumber)); //извваждане
        //System.out.println(firstNumber.divide(secondNumber)); //деление

    }
}
// Друго решение на задачата //You are given two lines – the first one can be a really big number (0 to 1050).
// The second one will be a single-digit number (0 to 9). You must display the product of these numbers.

//Note: do not use the BigInteger class.

/*
  String bigNumber = scanner.nextLine().trim();
        int multiplier = Integer.parseInt(scanner.nextLine().trim());

        // Ако множителят е 0, резултатът е винаги 0
        if (multiplier == 0) {
            System.out.println(0);
            return;
        }

        // Премахване на водещите нули от числото
        bigNumber = bigNumber.replaceFirst("^0+", "");

        // Подготвяме резултата
        StringBuilder result = new StringBuilder();
        int carry = 0; // Променлива за пренасянето

        // Умножаваме всяка цифра от дясно наляво
        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int currentDigit = bigNumber.charAt(i) - '0'; // Превръщаме символа в число
            int product = currentDigit * multiplier + carry; // Умножаваме и добавяме пренасянето

            result.append(product % 10); // Добавяме последната цифра на резултата
            carry = product / 10; // Изчисляваме новото пренасяне
        }

        // Ако има оставащо пренасяне, добавяме го към резултата
        if (carry > 0) {
            result.append(carry);
        }

        // Обръщаме резултата и го отпечатваме
        System.out.println(result.reverse().toString());
 */