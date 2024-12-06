package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptText = new StringBuilder();//""

        for (char symbol : text.toCharArray()) {
            char encryptedSymbol = (char) (symbol + 3);
            encryptText.append(encryptedSymbol);
        }

        System.out.println(encryptText);
    }
}
