package app;

public class Circle implements CalcAreaFigure {

    //Створюємо змінні для обрахування площі
    private static final double PI = Math.PI;
    private final double radius;

    //Конструктор для отримання параметрів фігури
    public Circle(double radius) {
        this.radius = radius;
    }

    //Перевизначення методу інтерфейсу для обчислення конкретної фігури (коло)
    @Override
    public double calcAreaFigure() {
        return PI * radius * radius;
    }
}