package figure;

import app.CalcAreaFigure;

public class Square implements CalcAreaFigure {

    //Створюємо змінні для обрахування площі
    private final double lengthSideSquare;

    //Конструктор для отримання параметрів фігури
    public Square(double lengthSideSquare) {
        this.lengthSideSquare = lengthSideSquare;
    }

    //Перевизначення методу інтерфейсу для обчислення конкретної фігури (квадрат)
    @Override
    public double calcAreaFigure() {
        return lengthSideSquare * lengthSideSquare;
    }
}