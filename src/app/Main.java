package app;

public class Main {

    public static void main(String[] args) {
        int sum = 0; // Змінна для наростаючої суми
        int totalSum = 0; // Загальна сума чисел

        System.out.println("Наростаюча сума чисел:"); // Титульний рядок

        for (int i = 1; i <= 6; i++) {
            sum += i; // Додаємо поточне число до суми
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
            totalSum = sum; // Загальна сума оновлюється наростаючою сумою
        }

        // Розділювальна лінія та вивід загальної суми
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + totalSum);
    }
}