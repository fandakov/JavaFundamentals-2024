package BasicSyntaxAndLoops;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String name = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                double averageGrade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,averageGrade);




            }
        }



