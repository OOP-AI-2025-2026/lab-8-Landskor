package ua.opnu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 3
        System.out.println("=== Задание 3: printArray ===");
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        System.out.println("Integer array:");
        myPrinter.printArray(intArray);
        System.out.println("String array:");
        myPrinter.printArray(stringArray);
        // Задание 4
        System.out.println("\n=== Задание 4: filter ===");
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Integer[] evenNumbers = FilterUtils.filter(numbers, isEven);
        System.out.println("Четные числа: " + Arrays.toString(evenNumbers));
        String[] words = {"яблоко", "груша", "арбуз", "дыня", "ананас", "кот"};
        Predicate<String> longWords = s -> s.length() > 4;
        String[] longWordArray = FilterUtils.filter(words, longWords);
        System.out.println("Слова длиннее 4 букв: " + Arrays.toString(longWordArray));
        // Задание 5
        System.out.println("\n=== Задание 5: contains ===");
        Integer[] numArray = {10, 20, 30, 40, 50};
        System.out.println("Массив чисел: " + Arrays.toString(numArray));
        System.out.println("Есть 30? " + ArrayUtils.contains(numArray, 30));
        System.out.println("Есть 99? " + ArrayUtils.contains(numArray, 99));
        String[] names = {"Анна", "Борис", "Виктор", "Галина"};
        System.out.println("Массив имен: " + Arrays.toString(names));
        System.out.println("Есть 'Борис'? " + ArrayUtils.contains(names, "Борис"));
        System.out.println("Есть 'Дмитрий'? " + ArrayUtils.contains(names, "Дмитрий"));
        // Задание 6
        System.out.println("\n=== Задание 6: tuples ===");
        GenericTwoTuple<String, Integer> student = new GenericTwoTuple<>("Иван Петров", 95);
        System.out.println("Студент: " + student.first + ", балл: " + student.second);
        GenericTwoTuple<Double, Double> coordinates = new GenericTwoTuple<>(48.3794, 31.1656);
        System.out.println("Координаты: широта " + coordinates.first + ", долгота " + coordinates.second);
        GenericThreeTuple<String, String, Double> product = new GenericThreeTuple<>(
                "Ноутбук", "Dell", 1299.99
        );
        System.out.println("Товар: " + product);
        GenericThreeTuple<String, String, Integer> book = new GenericThreeTuple<>(
                "Майстер і Маргарита", "Михайло Булгаков", 1967
        );
        System.out.println("Книга: " + book);
        GenericThreeTuple<String, String, Boolean> examResult = new GenericThreeTuple<>(
                "Анна Коваленко", "Математика", true
        );
        System.out.println("Экзамен: " + examResult);
    }
}