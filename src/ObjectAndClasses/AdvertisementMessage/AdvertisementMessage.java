package ObjectAndClasses.AdvertisementMessage;

import java.util.Random;

public class AdvertisementMessage {

    private static final String[] phrases = {
            "Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."
    };

    private static final String[] events = {
            "Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"
    };

    private static final String[] authors = {
            "Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"
    };

    private static final String[] cities = {
            "Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"
    };

    private final Random random = new Random();

    String generateRandomMessage() {
        String phrase = phrases[random.nextInt(phrases.length)];
        String event = events[random.nextInt(events.length)];
        String author = authors[random.nextInt(authors.length)];
        String city = cities[random.nextInt(cities.length)];

        return phrase + " " + event + " " + author + " – " + city;
    }
}