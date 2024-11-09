package BasicSyntaxAndLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumSabers = Math.ceil(countStudents + 0.10 * countStudents) * priceSaber;

        double sumRobes = countStudents * priceRobe;

        double sumBelts = (countStudents - countStudents / 6) * priceBelt;

        double totalSum = sumSabers + sumRobes + sumBelts;

        if (money >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double neededMoney = totalSum - money;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}
