package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();

        // 1. Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        obj.printSquare(number);

        // 2. Напишіть метод, який обчислює об'єм циліндра з заданим радіусом і висотою.
        obj.calculateCylinderVolume(3.5, 10.0);

        // 3. Напишіть метод, який обчислює суму елементів у масиві чисел.
        int[] numbers = {10, 20, 30, 40, 50};
        obj.calculateArraySum(numbers);

        // 4. Напишіть метод, який реверсує рядок.
        scanner.nextLine(); // consume the newline character
        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();
        obj.reverseString(inputString);

        // 5. Напишіть метод, який обчислює a в степені b.
        int a = obj.getInput("a", scanner);
        int b = obj.getInput("b", scanner);
        obj.calculatePower(a, b);

        // 6. Напишіть метод, який повторює заданий текст n разів.
        int n = obj.getInput("ціле число n", scanner);
        scanner.nextLine(); // consume the newline character
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        obj.repeatText(text, n);

        scanner.close();
    }

    // Метод для виведення квадрату числа
    public void printSquare(int n) {
        System.out.println("Квадрат числа " + n + " дорівнює " + n * n + ".");
    }

    // Метод для обчислення об'єму циліндра
    public void calculateCylinderVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");
    }

    // Метод для обчислення суми елементів масиву
    public void calculateArraySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");
    }

    // Метод для реверсу рядка
    public void reverseString(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        System.out.println("Рядок в зворотньому порядку: " + reversedString);
    }

    // Метод для обчислення a в степені b
    public void calculatePower(int a, int b) {
        System.out.println("Результат " + a + "^" + b + " дорівнює " + Math.pow(a, b) + ".");
    }

    // Метод для повторення тексту n разів
    public void repeatText(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    // Метод для отримання цілого числа введеного користувачем
    public int getInput(String message, Scanner scanner) {
        System.out.print("Введіть " + message + ": ");
        return scanner.nextInt();
    }
}