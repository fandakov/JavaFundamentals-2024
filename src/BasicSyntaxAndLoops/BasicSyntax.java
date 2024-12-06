package BasicSyntaxAndLoops;

import java.util.Scanner;

public class BasicSyntax {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %2.f", name, age, averageGrade);


    }
}
