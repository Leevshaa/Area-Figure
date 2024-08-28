package figure;

import app.CalcAreaFigure;

public class Triangle implements CalcAreaFigure {

    //Створюємо змінні для обрахування площі
    private final double sideTriangle;
    private final double height;

    //Конструктор для отримання параметрів фігури
    public Triangle(double sideTriangle, double height) {
        this.sideTriangle = sideTriangle;
        this.height = height;
    }

    //Перевизначення методу інтерфейсу для обчислення конкретної фігури (трикутник)
    @Override
    public double calcAreaFigure() {
        return 0.5 * sideTriangle * height;
    }
}