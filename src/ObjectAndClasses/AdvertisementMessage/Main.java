package ObjectAndClasses.AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AdvertisementMessage ad = new AdvertisementMessage();

        System.out.print("Enter the number of messages to generate: ");
        int messageCount = scanner.nextInt();

        for (int i = 0; i < messageCount; i++) {
            System.out.println(ad.generateRandomMessage());
        }
    }
}
