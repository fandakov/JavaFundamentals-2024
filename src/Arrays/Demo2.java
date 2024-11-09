package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = "1 2 3 4 5";

        String[] nums = input.split(" "); //->["1", "2", "3","4","5"]

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        double [] salaries = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToDouble(Double::parseDouble)
                .toArray();

        // for (int i = 0; i < nums.length; i++) {

        //numbers[i] = Integer.parseInt(nums[i]);
    }

}

/*
1.Масивът е съвкупност от еднотипни елементи;
2. Масивът има постоянна дължина - статичен;
3. Дълвината на Масива = броя елемнти в него;
4. Задаваме стойност на елемент: array[0] = 99;
5. Достъпване елемент в масив -> array[10] - Достъпваме елемента на индекс 10
6. позиции/индекси -> започваме от 0 до дължината -1
7. Foreach - обхождаме масив последователно от първия до последния елемент;
8. For - обхождаме масив, когато ни трябва да работим с конкретен индекс
9. Пълнене на масиви -> Demo1 Вариант1, Вариант2, Вариант3 - а в Демо2 Вариант4

 */