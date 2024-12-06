package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sourceAvailability = Integer.parseInt(scanner.nextLine()); //брой налични подправки в Source / поле
        int days = 0; //брой дни, в които събираме подправки
        int totalSpices = 0; //обща стойност на събраните подправки

        //повтаряме: събираме подправки от Source (поле)
        //stop: sourceAvailability < 100 -> спираме да събираме подправки
        //продължаваме: sourceAvailability >= 100 -> събираме подправки

        while (sourceAvailability >= 100) {
            //събираме подправки
            days++;
            //1. колко на брой подправки събираме
            int spicePerDay = sourceAvailability - 26;
            //2. сумирам събраните подправки за ден
            totalSpices += spicePerDay;
            //3. полето, от което добиваме подправката отслабва
            sourceAvailability -= 10;
        }

        //спираме да събираме подправки, защото вече Source / поле не е годно
        //бракуваме 26 от събраните
        totalSpices -= 26;

        //не можем след бракуването да сме на минус
        if (totalSpices < 0) {
            totalSpices = 0;
        }

        System.out.println(days);
        System.out.println(totalSpices);



    }
}
// Write a program that calculates the total amount of spice extracted from a source.
//The source has a starting yield, which indicates how much spice can be mined on the first day.
// After it has been mined for a day, the yield drops by 10, meaning on the second day, it'll produce 10 less spice than on the first, on the third day 10 less than on the second,
// and so on (see examples).
//A source is considered profitable only while its yield is at least 100 – when less than 100 spices are expected in a day, abandon the source.
//The mining crew consumes 26 spices every day at the end of their shift and an additional 26 after the mine has been exhausted.
//Note that the workers cannot consume more spice than there is in storage.
//When the operation is complete, print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted.

//Input
//You will receive a number representing the starting yield of the source.

//Output
//Print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted.