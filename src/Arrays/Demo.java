package Arrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] days = new int[7];

        System.out.println(days.length);

        //добавяне на елементи в масива Вариант 1 - когато не знаем колко елемента имаме
        days [0] = 1;
        days [1] = 2;
        days [2] = 3;

        // достъпване на последния елемент

        System.out.println(days[days.length - 1]);

        String [] months = new String[12];
        System.out.println(months.length);

        //достъпване на елемент
        System.out.println(days[0]); // принтираме числото 1 -> позиция 0

        //елементи от 0 до length - 1;

        String name = "Stoyan";
        //"Stoyan".toCharArray() -> ['S', 't', 'o', 'y'..]
        char [] letters = name.toCharArray();

        System.out.println(letters[letters.length - 1]);

        // Създаване на масив ако знаем предварително стойностите, които искаме да запазим = Вариант 2
        String[] weekdays = {"Monday","Tuesday","Wednesday"};

        System.out.printf("%s%n",weekdays[0]);

        for (int i = 0; i < weekdays.length; i++) {

            System.out.println(weekdays[i]);

        }

        //Foreach ->  служи да обхождаме колекции

        // При създаване на променливата (day) типът на променливата трябва да е идентичен с този на елементите в масива


        for (String day : weekdays) {
            System.out.println(day);
        }

        // Вариант 1 за запълване на Масив
        int [] numbers = {1, 10, 20, 30};

        //Вариант 2 за запълване на Масив
        int [] counts = new int[4];
        counts[0] = 100;
        counts[1] = 200;
        counts[3] = Integer.parseInt(scanner.nextLine());


        int n = Integer.parseInt(scanner.nextLine());

        int [] array = new int[n];

        for (int position = 0; position < array.length; position++) {
            array[position] = Integer.parseInt(scanner.nextLine());
        }


        //Вариант 3



    }
}
