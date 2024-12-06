package MidExam;

import java.util.Scanner;

public class GoogleSearches_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                double incomePerSearch = Double.parseDouble(scanner.nextLine());
                int numUsers = Integer.parseInt(scanner.nextLine());

                double totalMoney = 0;

                for (int i = 1; i <= numUsers; i++) {
                    int searchCount = Integer.parseInt(scanner.nextLine());


                    double currentIncomePerSearch  = incomePerSearch;

                    if (i  % 3 == 0) {
                        currentIncomePerSearch *= 3;
                        if (searchCount > 5) {
                            currentIncomePerSearch *= 2;
                        }
                    } else if (searchCount > 5) {
                        currentIncomePerSearch *= 2;
                    }


                    if (searchCount > 1) {
                        totalMoney += searchCount * currentIncomePerSearch;
                    }
                }

                System.out.printf("Total money earned: %.2f%n", totalMoney);

            }
        }










