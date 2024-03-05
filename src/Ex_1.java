/*----------------------------------------------------
                        Завдання 1
-----------------------------------------------------*/
import java.util.Scanner;

public class Ex_1 {
    public static class Sqer {
        double x;

        // Конструктор класу Sqer
        public Sqer(double x) {
            this.x = x;
        }

        // Метод для обчислення площі квадрата
        public double calculateArea() {
            return x * x;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть довжину сторони квадрата: ");
        double sideLength = scn.nextDouble();

        // Створення об'єкту квадрата
        Sqer Kvadrat = new Sqer(sideLength);

        // Виведення площі квадрата
        System.out.println("Площа вашого квадрату = " + Kvadrat.calculateArea());
    }
}
